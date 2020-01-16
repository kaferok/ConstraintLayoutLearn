package com.bijov1apps.constraintlayouttest

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bijov1apps.constraintlayouttest.rv.RvAdapter
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val adapter: RvAdapter = RvAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        Glide.with(this)
            .load(getDrawable(R.drawable.chel))
            .circleCrop()
            .into(personIcon)

        Glide.with(this)
            .load(getDrawable(R.drawable.chel))
            .fitCenter()
            .into(backgroundImage)

        adapter.items = listOf(1, 1, 1, 1, 1, 1, 1, 1)
        rvClients.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvClients.adapter = adapter
    }
}
