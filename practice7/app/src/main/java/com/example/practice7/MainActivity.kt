package com.example.practice7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.practice7.`interface`.RetrofitServieces
import com.example.practice7.model.data
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var  rv22:RecyclerView
    lateinit var res:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv22=findViewById(R.id.rec_view)
        val retrofit = myretrofit().getRetrofit()
        val api_ret=retrofit.create(RetrofitServieces::class.java)
        val rert_call:Call<data> = api_ret.getImage()
        rert_call.enqueue(object :retrofit2.Callback<data> {
            override fun onResponse(call: Call<data>, response: Response<data>) {
                if (response.isSuccessful) {
                    rv22.adapter = response.body()?.let { adapterv(applicationContext, it.data) }
                }
            }

            override fun onFailure(call: Call<data>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
        }}



