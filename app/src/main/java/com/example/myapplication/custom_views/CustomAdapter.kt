package com.example.myapplication.custom_views

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.text_element.view.*

class CustomAdapter(private val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.text_element, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.textView?.text = items[position]
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v){
       val textView = v.textContainer
    }
}