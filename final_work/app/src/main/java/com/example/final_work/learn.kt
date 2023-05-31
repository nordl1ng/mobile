package com.example.final_work

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.content.SharedPreferences
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class learn : AppCompatActivity() {
    lateinit var username: TextView
    lateinit var preff: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
        username=findViewById(R.id.username)
        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)
        username.setText("Привет, " + preff?.getString("name", "") + "!")

        val poster_res: RecyclerView =findViewById((R.id.rec_view))
        poster_res.adapter = Poster_adapter(this, posterList().list)
        }
    fun next(view: View) {
        var intent = Intent(this, test::class.java)
        startActivity(intent)
        finish()
    }
}