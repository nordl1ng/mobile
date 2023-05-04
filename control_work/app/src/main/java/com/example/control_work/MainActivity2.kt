package com.example.control_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun next(view: View) {
        var intent = Intent(this@MainActivity2,MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
    fun next2(view: View) {
        var intent = Intent(this@MainActivity2,MainActivity4::class.java)
        startActivity(intent)
        finish()
    }
}

