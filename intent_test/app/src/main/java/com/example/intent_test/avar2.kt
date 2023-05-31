package com.example.intent_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class avar2 : AppCompatActivity() {

    lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avar2)
        username=findViewById(R.id.username)
        var value: Int = 8
        value = intent.getIntExtra("name", 2)
        username.setText("Привет, "+ value)
    }
}