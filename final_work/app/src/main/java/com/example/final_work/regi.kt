package com.example.final_work

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class regi : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var family: EditText
    lateinit var mail:EditText
    lateinit var pass: EditText
    lateinit var passrep: EditText
    val pattern = ("[a-z]{1,100}" + "@" + "[a-z]{1,6}" + "\\." + "[a-z]{1,5}")

    var preff: SharedPreferences?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regi)
        name= findViewById(R.id.editTextTextPersonName)
        family= findViewById(R.id.editTextTextPersonName2)
        mail= findViewById(R.id.editTextTextPersonName3)
        pass= findViewById(R.id.editTextTextPersonName4)
        passrep= findViewById(R.id.editTextTextPersonName5)
        preff=getSharedPreferences("TABLEE", MODE_PRIVATE)
        name.setText(preff?.getString("name",""))
    }
    fun saveData(name:String)
    {
        val editor=preff?.edit()
        editor?.putString("name",name)
        editor?.apply()
    }
    fun emailValid(text:String):Boolean
    {
        return Pattern.compile(pattern).matcher(text).matches()}

    fun next(view: View) {
        if(name.text.toString().isNotEmpty()&&family.text.toString().isNotEmpty()&&mail.text.toString().isNotEmpty()&&passrep.text.toString().isNotEmpty())
        {
            if (emailValid(mail.text.toString()))
            {
                if (pass.text.toString()==passrep.text.toString())
                {
                    Toast.makeText(this, "Регистрация прошла успешно", Toast.LENGTH_LONG).show()
                    val value: String = name.text.toString()
                    saveData(value)
                    val inten = Intent(this, learn::class.java)
                    startActivity(inten)
                }
                else {            var alert = AlertDialog.Builder(this)
                    .setTitle("Пароли не одинаковые")
                    .setPositiveButton("ok", null)
                    .create()
                    .show()}
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
        var intent = Intent(this@regi,enter::class.java)
        startActivity(intent)
        finish()
    }
}