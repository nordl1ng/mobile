package com.example.control_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity7 : AppCompatActivity() {
    lateinit var mail:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        mail= findViewById(R.id.EditText1)
    }
    fun next2(view: View) {
        var intent = Intent(this@MainActivity7, MainActivity3::class.java)
        startActivity(intent)
        finish()}



    fun next(view: View) {
        if (mail.text.toString().isNotEmpty())
        {
            var intent = Intent(this@MainActivity7, MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        else
        {
            var alert = AlertDialog.Builder(this)
                .setTitle("Заполните логин / email")
                .setPositiveButton("ok", null)
                .create()
                .show()
        }
    }
}