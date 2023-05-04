package com.example.control_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var pass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        login= findViewById(R.id.EditText)
        pass= findViewById(R.id.EditText2)
    }
    fun next(view: View) {
        if (login.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()) {
            var intent = Intent(this@MainActivity3, MainActivity6::class.java)
            startActivity(intent)
            finish()
        } else {
            var alert = AlertDialog.Builder(this)
                .setTitle("Заполните текстовые поля")
                .setPositiveButton("ok", null)
                .create()
                .show()
        }
    }
    fun next2(view: View) {
        var intent = Intent(this@MainActivity3, MainActivity7::class.java)
        startActivity(intent)
        finish()}
}