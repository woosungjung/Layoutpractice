package com.example.layoutpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.date_row.view.*

class DatesAdapter(private val dates: List<String>) : RecyclerView.Adapter<DatesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.date_row,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount()= dates.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dateName.text=dates[position]
    }
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val dateName = view.dateName

    }

}
