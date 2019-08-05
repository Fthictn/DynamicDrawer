package com.info.volleykullanimi.xmlelements

import android.content.Context
import android.view.ViewGroup
import com.google.gson.Gson
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

fun RecursiveParser(jsonArry:JSONArray,viewgrp:ViewGroup,context:Context):Unit{
    var gson:Gson=Gson()

    for (item in 0 until jsonArry.length()){
        var result=jsonArry.getJSONObject(item)
        when(result.getString("name")){
                "textview"->{
                    var text_view: AutoTextview = gson.fromJson(result.toString(), AutoTextview::class.java)
                    viewgrp.addView(Operations.ToCreateTextView(context,text_view))

                }

                 "button"->{
                     var btn:AutoButton=gson.fromJson(result.toString(),AutoButton::class.java)
                     viewgrp.addView(Operations.ToCreateButton(context,btn))
                 }

                 "edittext"->{
                     var edit_text:AutoEditText=gson.fromJson(result.toString(),AutoEditText::class.java)
                     viewgrp.addView(Operations.ToCreateEditText(context,edit_text))
                 }

                 "linearlayout"->{
                     var container:AutoLinearLayout= AutoLinearLayout()
                     container.id=result.getString("id").toInt()
                     container.layout_width=result.getString("layout_width")
                     container.layout_height=result.getString("layout_height")
                     container.background=result.getString("background")
                     //container.orientation=result.getString("orientation").toInt()
                     viewgrp.addView(Operations.ToCreateLinearLayout(context,container))
                     return RecursiveParser(result.getJSONArray("items"),viewgrp,context)
                 }

                 "relativelayout"->{
                     var container:AutoRelativeLayout= AutoRelativeLayout()
                     container.id=result.getString("id").toInt()
                     container.layout_width=result.getString("layout_width")
                     container.layout_height=result.getString("layout_height")
                     container.background=result.getString("background")
                     viewgrp.addView(Operations.ToCreateRelativeLayout(context,container))
                     return RecursiveParser(result.getJSONArray("items"),viewgrp,context)
                 }
        }

    }


}