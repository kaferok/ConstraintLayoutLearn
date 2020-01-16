package com.bijov1apps.constraintlayouttest.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bijov1apps.constraintlayouttest.R
import kotlinx.android.synthetic.main.rv_item.view.*

class RvViewHolder(private var view: View): RecyclerView.ViewHolder(view) {

    fun bind(){
        view.clientName.text = view.context.getString(R.string.test_name)
    }
}