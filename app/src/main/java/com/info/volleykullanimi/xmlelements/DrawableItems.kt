package com.info.volleykullanimi.xmlelements

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.media.Image
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.util.*

class AutoLinearLayout{
    var id:Int?=null
    var component_id:String?=null
    var layout_width: String?=null
    var layout_height:String?=null
    var orientation:Int?=null
    var gravity:Int?=null
    var weightSum:Float?=null
    var background:String?=null
}

class AutoRelativeLayout{
    var id:Int?=null
    var layout_width: String?=null
    var layout_height:String?=null
    var gravity:Int?=null
    var background:String?=null
}

class AutoButton{
    var id:Int?=null
    var width:Int?=null
    var height:Int?=null
    var text:String?=null
    var background:String?=null
}

class AutoTextview{
    var id:Int?=null
    var width:Int?=null
    var height:Int?=null
    var text:String?=null
    var textSize:Float?=null
    var background:String?=null
}

class AutoEditText{
    var id:Int?=null
    var layout_width:String?=null
    var layout_height:String?=null
    var background:String?=null
}

//ArrayList<id,View v> =
class Operations{

    companion object {
        fun ToCreateButton(context: Context, toDraw: AutoButton): Button {

            var buttonToDraw: Button = Button(context)

            toDraw.id?.let {
                buttonToDraw.id =it
            }


            toDraw.text?.let {
                buttonToDraw.text = it
            }

            toDraw.background?.let {
                buttonToDraw.setBackgroundColor(Color.GREEN)
            }
            if(toDraw.width!=null && toDraw.height!=null){
                buttonToDraw.layoutParams = ViewGroup.LayoutParams(toDraw.width!!,toDraw.height!!)
            }


            //myItems.put(it,buttonToDraw)
            return buttonToDraw
        }

    fun ToCreateTextView(context: Context, toDraw: AutoTextview): TextView {

            var textviewToDraw: TextView = TextView(context)

            toDraw.id?.let {
                textviewToDraw.id = it
            }
            toDraw.text?.let {
                textviewToDraw.text = it
            }
            toDraw.textSize?.let {
                textviewToDraw.textSize = it
            }
            toDraw.background?.let {
                textviewToDraw.setBackgroundColor(Color.BLUE)
            }
            if(toDraw.width!=null && toDraw.height!=null){
                textviewToDraw.layoutParams = ViewGroup.LayoutParams(toDraw.width!!,toDraw.height!!)
            }

            return textviewToDraw
        }

        fun ToCreateLinearLayout(context: Context, toDraw: AutoLinearLayout): LinearLayout {

            var linearlayoutToDraw: LinearLayout = LinearLayout(context)

            toDraw.id?.let {
                linearlayoutToDraw.id = it
            }
            toDraw.orientation?.let {
                linearlayoutToDraw.orientation = it
            }
            toDraw.background?.let {
                linearlayoutToDraw.setBackgroundColor(Color.CYAN)
            }

            toDraw.gravity?.let {
                linearlayoutToDraw.gravity = it
            }
            toDraw.weightSum?.let {
                linearlayoutToDraw.weightSum = it
            }
            if (toDraw.layout_width == "WRAP_CONTENT" && toDraw.layout_height == "WRAP_CONTENT") {
                linearlayoutToDraw.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            }
            if (toDraw.layout_width == "MATCH_PARENT" && toDraw.layout_height == "MATCH_PARENT") {
                linearlayoutToDraw.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
                )
            }
            if (toDraw.layout_width == "MATCH_PARENT" && toDraw.layout_height == "WRAP_CONTENT") {
                linearlayoutToDraw.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            }
            if (toDraw.layout_width == "WRAP_CONTENT" && toDraw.layout_height == "MATCH_PARENT") {
                linearlayoutToDraw.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
                )
            }

            return linearlayoutToDraw
        }

        fun ToCreateRelativeLayout(context: Context, toDraw: AutoRelativeLayout): RelativeLayout {

            var relativelayoutToDraw: RelativeLayout = RelativeLayout(context)

            toDraw.id?.let {
                relativelayoutToDraw.id = it
            }
            toDraw.gravity?.let {
                relativelayoutToDraw.gravity = it
            }
            toDraw.background?.let {
                relativelayoutToDraw.setBackgroundColor(Color.BLACK)
        }
            if (toDraw.layout_width == "WRAP_CONTENT" && toDraw.layout_height == "WRAP_CONTENT") {
                relativelayoutToDraw.layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
                )

            }
            if (toDraw.layout_width == "MATCH_PARENT" && toDraw.layout_height == "MATCH_PARENT") {
                relativelayoutToDraw.layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT
                )
            }
            if (toDraw.layout_width == "MATCH_PARENT" && toDraw.layout_height == "WRAP_CONTENT") {
                relativelayoutToDraw.layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
                )
            }
            if (toDraw.layout_width == "WRAP_CONTENT" && toDraw.layout_height == "MATCH_PARENT") {
                relativelayoutToDraw.layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT
                )
            }

            return relativelayoutToDraw
        }

        fun ToCreateEditText(context: Context,toDraw:AutoEditText):EditText{

            var edittextToDraw:EditText= EditText(context)

            toDraw.id?.let {
                edittextToDraw.id=it
            }
            toDraw.background?.let {
                edittextToDraw.setBackgroundColor(Color.YELLOW)
            }

            if (toDraw.layout_width == "WRAP_CONTENT" && toDraw.layout_height == "WRAP_CONTENT") {
                edittextToDraw.layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            }
            if (toDraw.layout_width == "MATCH_PARENT" && toDraw.layout_height == "MATCH_PARENT") {
                edittextToDraw.layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
            }
            if (toDraw.layout_width == "MATCH_PARENT" && toDraw.layout_height == "WRAP_CONTENT") {
                edittextToDraw.layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            }
            if (toDraw.layout_width == "WRAP_CONTENT" && toDraw.layout_height == "MATCH_PARENT") {
                edittextToDraw.layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
            }
            return edittextToDraw
        }
        }
    }