package com.example.practice7.`interface`

import com.example.practice7.model.data
import com.example.practice7.model.data_movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServieces {
    @GET("feelings")
    fun getImage():Call<data>
}