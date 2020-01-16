package com.bijov1apps.constraintlayouttest.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bijov1apps.constraintlayouttest.R

class RvAdapter:RecyclerView.Adapter<RvViewHolder>() {

    var items:List<Int> = arrayListOf()
    set(value){
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder =
        RvViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind()
    }
}