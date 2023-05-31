package com.example.intent_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var a : Int = 0
    lateinit var check: CheckBox
    lateinit var check2: CheckBox
    lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        check=findViewById(R.id.checkbox)
        check2=findViewById(R.id.checkbox2)
        username=findViewById(R.id.username)
    }

    fun test(view: View) {
        a = 0
        if (check.isChecked == true) {
            a += 1
        }
        if (check2.isChecked == true) {
            a += 1
        }

        username.setText("Привет, " + a + "!")
        val inten = Intent(this, avar2::class.java)
        inten.putExtra("name", a);
        startActivity(inten)
    }
}