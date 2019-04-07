package com.example.random

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener{ view ->

            val addThoughtIntent =  Intent(this,AddThoughtActivity::class.java)
            startActivity(addThoughtIntent)

        }
    }
}

