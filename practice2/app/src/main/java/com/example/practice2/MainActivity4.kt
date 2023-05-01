package com.example.practice2

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.practice2.databinding.ActivityMain4Binding

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