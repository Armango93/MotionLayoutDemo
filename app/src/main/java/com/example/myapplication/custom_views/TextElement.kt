package com.example.myapplication.custom_views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.text_element.view.*

class TextElement @JvmOverloads constructor (
    context: Context,
    attr: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0) :  FrameLayout(context, attr, defStyleAttr, defStyleRes) {

    var text: String?
        get() = textContainer.text.toString()
        set(value) {
            textContainer.text = value
        }

    init {
        LayoutInflater.from(context).inflate(R.layout.text_element, this, true)
    }

}