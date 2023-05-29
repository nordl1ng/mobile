package com.example.fw

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val timer = object : CountDownTimer(8000,1000)
        {
            override fun onTick(millisUntilFinished: Long){

            }
            override fun onFinish(){
                val intent = Intent(this@MainActivity4,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
    fun next2(view: View) {
        var intent = Intent(this@MainActivity4,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}