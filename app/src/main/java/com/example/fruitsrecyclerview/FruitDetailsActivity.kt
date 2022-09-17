package com.example.fruitsrecyclerview

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FruitDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fruit_description)

        val fruitImage: ImageView = findViewById(R.id.Fruit_image)
        val fruitName: TextView = findViewById(R.id.Fruit_name)
        val fruitdesc: TextView = findViewById(R.id.Fruit_Describtion)

        val fruit = intent.getParcelableExtra<Fruits>("Fruit")

            fruitName.text=fruit?.name
            fruitImage.setImageResource(fruit!!.image)
            fruitdesc.text=fruit?.ShortDesc
    }
}