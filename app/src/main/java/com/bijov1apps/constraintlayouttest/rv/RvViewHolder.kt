package com.bijov1apps.constraintlayouttest.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bijov1apps.constraintlayouttest.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rv_item.view.*

class RvViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

    fun bind() {
        Glide.with(view.context)
            .load(view.context.getDrawable(R.drawable.chel))
            .circleCrop()
            .into(view.clientIcon)

        view.clientName.text = view.context.getString(R.string.test_name)
    }
}