package com.example.final_work

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class result : AppCompatActivity() {

    lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        username=findViewById(R.id.username)
        var value: Int = 8
        value = intent.getIntExtra("name", 2)
        username.setText("" + value)
    }

    fun next2(view: View) {
        var intent = Intent(this@result,enter::class.java)
        startActivity(intent)
        finish()
    }

    fun next(view: View) {
        var intent = Intent(this@result,test::class.java)
        startActivity(intent)
        finish()
    }
}