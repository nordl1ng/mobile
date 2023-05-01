package com.example.practice2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class MainActivity2 : AppCompatActivity() {
    lateinit var mail:EditText
    lateinit var pass:EditText
    val pattern = ("[a-z]{1,100}" + "@" + "[a-z]{1,6}" + "\\." + "[a-z]{1,5}")
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mail= findViewById(R.id.editTextTextPersonName)
        pass= findViewById(R.id.editTextTextPersonName2)
    }
    fun emailValid(text:String):Boolean
    {
        return Pattern.compile(pattern).matcher(text).matches()}
    
    fun next(view: View) {
        if(mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            if (emailValid(mail.text.toString()))
            {
                val intent = Intent(this@MainActivity2, MainActivity4::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this,"Ошибка email", Toast.LENGTH_LONG).show()
            }
        }
        else
        {
            var alert = AlertDialog.Builder(this)
                .setTitle("Заполните текстовые поля")
                .setPositiveButton("ok",null)
                .create()
                .show()
        }
    }

    fun next2(view: View) {
        var intent = Intent(this@MainActivity2,MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
}