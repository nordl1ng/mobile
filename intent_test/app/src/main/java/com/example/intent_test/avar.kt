package com.example.intent_test

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class avar : AppCompatActivity() {

    lateinit var username: TextView
//    lateinit var value : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        username=findViewById(R.id.username)
//        value = "Привет"
//        username.setText("Привет," + value)
    }
}


