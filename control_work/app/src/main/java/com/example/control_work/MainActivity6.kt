package com.example.control_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val timer = object : CountDownTimer(2000,250)
        {
            override fun onTick(millisUntilFinished: Long){

            }
            override fun onFinish(){
                val intent = Intent(this@MainActivity6,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}