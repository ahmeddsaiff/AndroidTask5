package com.example.fruitsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.RecyclerView)
        val fruitsAdapter = FruitsAdapter(getListOfFruits())
        recyclerView.adapter=fruitsAdapter
    }

    private fun getListOfFruits(): List<Fruits> {
        val fruits = mutableListOf<Fruits>()
        fruits.add(Fruits("Avocado" , R.drawable.avocado, "Name: Avocado \nColor:Dark Green"))
        fruits.add(Fruits("Banana" , R.drawable.banana , "Name: Banana \nColor:Yellow"))
        fruits.add(Fruits("BlueBerries" , R.drawable.blueberry , "Name: BlueBerries \nColor:Deep Purple"))
        fruits.add(Fruits("Raspberries" , R.drawable.raspberry , "Name: Raspberries \nColor:Pinkish Red"))
        fruits.add(Fruits("Cherry" , R.drawable.red_cherry , "Name: Cherry \nColor:Reddish Brown"))
        fruits.add(Fruits("Green Apple" , R.drawable.green_apple , "Name: Green Apple \nColor:Green"))
        fruits.add(Fruits("Green Grapes" , R.drawable.green_grapes , "Name: Green Grapes \nColor:Green"))
        fruits.add(Fruits("Red Apple" , R.drawable.red_apple , "Name: Red Apple \nColor:Red"))
        fruits.add(Fruits("Red Grapes" , R.drawable.red_grapes , "Name: Red Grapes \nColor:Dark Red"))
        fruits.add(Fruits("Kiwi" , R.drawable.kiwi , "Name: Kiwi \nColor:Golden Brown"))
        fruits.add(Fruits("Lemon" , R.drawable.lemon , "Name: Lemon \nColor:Yellow"))
        fruits.add(Fruits("Orange" , R.drawable.orange , "Name: Orange \nColor:Orange"))
        fruits.add(Fruits("Pineapple" , R.drawable.pineapple , "Name: Pineapple \nColor:Greenish Yellow"))
        fruits.add(Fruits("Pomegranate" , R.drawable.pomegranate , "Name: Pomegranate \nColor:Dark Red"))
        fruits.add(Fruits("Apricot" , R.drawable.apricot , "Name: Apricot \nColor:Orange Yellow"))
        fruits.add(Fruits("Strawberry" , R.drawable.strawberry , "Name: Strawberry \nColor:Red"))
        fruits.add(Fruits("mango" , R.drawable.mango , "Name: mango \nColor: Orangish Yellow"))
        return fruits
    }
}