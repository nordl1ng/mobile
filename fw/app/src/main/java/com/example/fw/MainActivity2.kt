package com.example.fw

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
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
        email=findViewById(R.id.editTextTextPersonName)
        password=findViewById(R.id.editTextTextPersonName2)
        check=findViewById(R.id.checkbox)
        preff=getSharedPreferences("TABLEE", MODE_PRIVATE)
        check.isChecked=preff?.getBoolean("key3",false)?:false
        email.setText(preff?.getString("key1",""))
        password.setText(preff?.getString("key2",""))
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
        deleteAll()
        var intent = Intent(this@MainActivity2,MainActivity3::class.java)
        startActivity(intent)
        finish()
    }

    var preff: SharedPreferences?=null
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var check: CheckBox
    fun saveData(mail:String,pass:String)
    {
        val editor=preff?.edit()
        editor?.putString("key1",mail)
        editor?.putString("key2",pass)
        editor?.apply()
    }
    fun savestate (check:Boolean)
    {
        val editor=preff?.edit()
        editor?.putBoolean("key3", check)
        editor?.apply()
    }


    fun deleteAll()
    {
        val editor=preff?.edit()
        editor?.clear()
        editor?.apply()
    }

    fun save22(view: View)
    {
        val value: String=email.text.toString()
        val value2: String=password.text.toString()
        val checkboxstate:Boolean=check.isChecked
        if (checkboxstate==true){
            saveData(value,value2)
                savestate(checkboxstate)
        }
        else
        {
            deleteAll()
        }

        val inten= Intent(this,ToolbarActivity::class.java)
        startActivity(inten)

    }

}

