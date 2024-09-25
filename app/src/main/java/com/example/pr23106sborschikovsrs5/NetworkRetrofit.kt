package com.example.pr23106sborschikovsrs5

import android.annotation.SuppressLint
import com.google.firebase.firestore.auth.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface MyApi {
    @SuppressLint("RestrictedApi")
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}

object RetrofitInstance {
    private const val BASE_URL = "https://api.example.com/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: MyApi by lazy {
        retrofit.create(MyApi::class.java)
    }
}