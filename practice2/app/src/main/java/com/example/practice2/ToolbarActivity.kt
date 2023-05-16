package com.example.practice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        val poster_res: RecyclerView =findViewById((R.id.rec_view))
        poster_res.adapter = Poster_adapter(this, PosterList().list)
    }
}