package com.example.control_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity4 : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var pass: EditText
    lateinit var pass_rep: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        login= findViewById(R.id.EditText)
        pass= findViewById(R.id.EditText2)
        pass_rep= findViewById(R.id.EditText3)
    }
    fun next(view: View) {
        if (login.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()) {
            if (pass.text.toString()==pass_rep.text.toString()){
            var intent = Intent(this@MainActivity4, MainActivity6::class.java)
            startActivity(intent)
            finish()
            }
            else {            var alert = AlertDialog.Builder(this)
                .setTitle("Пароли не одинаковые")
                .setPositiveButton("ok", null)
                .create()
                .show()}
        } else {
            var alert = AlertDialog.Builder(this)
                .setTitle("Заполните текстовые поля")
                .setPositiveButton("ok", null)
                .create()
                .show()
            }
        }
    fun next2(view: View) {
        var intent = Intent(this@MainActivity4, MainActivity2::class.java)
        startActivity(intent)
        finish()}
}