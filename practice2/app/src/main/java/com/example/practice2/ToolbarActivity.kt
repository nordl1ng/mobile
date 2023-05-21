package com.example.practice2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.content.SharedPreferences

class ToolbarActivity : AppCompatActivity() {
    lateinit var username: TextView
    lateinit var preff: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        username=findViewById(R.id.username)
        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)
        username.setText("Привет, " + preff?.getString("name", "") + "!")

        val poster_res: RecyclerView =findViewById((R.id.rec_view))
        poster_res.adapter = Poster_adapter(this, PosterList().list)

        val poster_res2: RecyclerView =findViewById((R.id.rec_view2))
        poster_res2.adapter = poster2_adapter(this, poster2List().list)
    }
}