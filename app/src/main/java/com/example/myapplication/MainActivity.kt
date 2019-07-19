package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.custom_views.CustomAdapter
import com.example.myapplication.custom_views.TextElement
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        content_container.layoutManager = LinearLayoutManager(this)
        content_container.adapter = CustomAdapter(addStrings(), this)
    }

    fun addStrings(): ArrayList<String> {
        val params = ViewGroup.LayoutParams(MATCH_PARENT, 80)
        val list: ArrayList<String> = arrayListOf()
        for (i in 0 until 20){
            list.add("Text for text №$i")
        }
        return list
    }
}
