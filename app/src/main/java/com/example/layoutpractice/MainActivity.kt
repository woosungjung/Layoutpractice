package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dates= listOf("월요일","화요일","수요일","목요일","금요일","토요일","일요일")
        datesRecyclerView.apply{
            layoutManager=LinearLayoutManager(this@MainActivity,RecyclerView.HORIZONTAL,false)
            adapter=DatesAdapter(dates)
        }
        val images= listOf(
            R.drawable.poster1,
            R.drawable.poster2,
            R.drawable.poster3
        )
        val adapter= ViewPagerAdapter(images)
        viewPager.adapter=adapter

    }

}