package com.example.pr23106sborschikovsrs5

import com.bumptech.glide.Glide
import android.widget.ImageView
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val imageView = findViewById<ImageView>(R.id.my_image_view)
        val context = this

        Glide.with(context)
            .load("https://example.com/image.jpg")
            .into(imageView)
    }
}