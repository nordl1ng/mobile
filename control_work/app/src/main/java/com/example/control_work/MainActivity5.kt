package com.example.control_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }
    fun next(view: View) {
        var intent = Intent(this@MainActivity5, MainActivity3::class.java)
        startActivity(intent)
        finish()}
}