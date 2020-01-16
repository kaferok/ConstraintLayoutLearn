package com.bijov1apps.constraintlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.bijov1apps.constraintlayouttest.rv.RvAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter:RvAdapter = RvAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter.items = listOf(1,1,1,1,1,1,1,1)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv.adapter = adapter
    }
}
