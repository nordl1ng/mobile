package com.example.final_work

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class test : AppCompatActivity() {
    var preff: SharedPreferences?=null
    lateinit var check: CheckBox
    var a : Int = 0
    lateinit var check1: CheckBox
    lateinit var check2: CheckBox
    lateinit var check3: CheckBox
    lateinit var check4: CheckBox
    lateinit var check5: CheckBox
    lateinit var check6: CheckBox
    lateinit var check7: CheckBox
    lateinit var check8: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        check1=findViewById(R.id.checkbox1)
        check2=findViewById(R.id.checkbox2)
        check3=findViewById(R.id.checkbox3)
        check4=findViewById(R.id.checkbox4)
        check5=findViewById(R.id.checkbox5)
        check6=findViewById(R.id.checkbox6)
        check7=findViewById(R.id.checkbox7)
        check8=findViewById(R.id.checkbox8)
        preff=getSharedPreferences("TABLEE", MODE_PRIVATE)
        val editor=preff?.edit()
    }

    fun test(view: View) {
        if ((check1.isChecked && check2.isChecked) or (check3.isChecked && check4.isChecked) or (check5.isChecked && check6.isChecked) or (check7.isChecked && check8.isChecked))
        {
            Toast.makeText(this,"Можно только один ответ", Toast.LENGTH_LONG).show()
        }
        else {
                a = 0
                if (check1.isChecked == true) {
                    a += 1
                }
                if (check4.isChecked == true) {
                    a += 1
                }
                if (check5.isChecked == true) {
                    a += 1
                }
                if (check8.isChecked == true) {
                    a += 1
                }
                val inten = Intent(this, result::class.java)
                inten.putExtra("name", a);
                startActivity(inten)

        }
    }
}