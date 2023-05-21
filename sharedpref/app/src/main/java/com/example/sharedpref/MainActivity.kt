package com.example.sharedpref

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    var preff: SharedPreferences?=null
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var check: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email=findViewById(R.id.editTextTextPersonName)
        password=findViewById(R.id.editTextTextPersonName2)
        check=findViewById(R.id.checkbox)
        preff=getSharedPreferences("TABLEE", MODE_PRIVATE)
        check.isChecked=preff?.getBoolean("key3",false)?:false
        email.setText(preff?.getString("key1",""))
        password.setText(preff?.getString("key2",""))
    }
    fun savestate (check:Boolean)
    {
        val editor=preff?.edit()
        editor?.putBoolean("key3", check)
        editor?.apply()
    }
    fun saveData(mail:String,pass:String)    {
        val editor=preff?.edit()
        editor?.putString("key1",mail)
            editor?.putString("key2",pass)
        editor?.apply()
    }
        fun deleteAll()
        {
            val editor=preff?.edit()
            editor?.clear()
            editor?.apply()
        }
    fun save22(view: View)    {
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
        val inten= Intent(this,MainActivity2::class.java)
        startActivity(inten)
    }

}