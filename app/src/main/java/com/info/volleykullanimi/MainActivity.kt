package com.info.volleykullanimi

import android.content.Context
import android.graphics.Color
import android.net.sip.SipSession
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.textclassifier.TextLinks
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.view.*
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import kotlin.math.log
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import com.android.volley.Response.Listener
import com.google.gson.*
import com.google.gson.reflect.TypeToken
import com.info.volleykullanimi.xmlelements.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.HashMap

class MainActivity : AppCompatActivity() {
     lateinit var url_nested:String
     lateinit var rq:RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rq=Volley.newRequestQueue(this)
        url_nested="http://www.mocky.io/v2/5d49909a320000e27d600dc3"
        CustomRenderer(rq,url_nested,applicationContext)
        //val txt:TextView= TextView(baseContext)

        }

    fun CustomRenderer(rq:RequestQueue,url:String,context: Context):Unit{
        val stringrequest=StringRequest(Request.Method.GET,url, Response.Listener<String>{ response ->
               try {

                   var o=JSONObject(response)
                   var values=o.getJSONArray("ToRender")
                   val firstParent = this.findViewById(R.id.alertTitle) as ViewGroup
                   firstParent.removeAllViews()

                   RecursiveParser(firstParent.id.toString(),values,firstParent,context)

               }catch (ex:JsonParseException){
                    Log.d("EXCEPTİON",ex.toString())
               }
        }, Response.ErrorListener {  })

         rq.add(stringrequest)
    }

}