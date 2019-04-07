package com.example.random

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add_thought.*

class AddThoughtActivity : AppCompatActivity() {

    var selectedCategory = FUNNY;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_thought)
    }

    fun addFunnyClicked(view: View){

        if(selectedCategory == FUNNY){

            addFunnyBtn.isChecked = true
            return
        }

        addSeriousBtn.isChecked = false
        addCrazyBtn.isChecked = false
        selectedCategory = FUNNY

    }

    fun addCrazyClicked(view: View){

        if(selectedCategory == CRAZY){

            addCrazyBtn.isChecked = true
            return
        }

        addSeriousBtn.isChecked = false
        addFunnyBtn.isChecked = false
        selectedCategory = CRAZY

    }

    fun addSeriousClicked(view : View){

        if(selectedCategory == SERIOUS){

            addSeriousBtn.isChecked = true
            return
        }

        addFunnyBtn.isChecked = false
        addCrazyBtn.isChecked = false
        selectedCategory = SERIOUS

    }

    fun addPostClickec(view : View){

    }
}
