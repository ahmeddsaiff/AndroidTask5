package com.example.fruitsrecyclerview

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitsAdapter(
    private val FruitList: List<Fruits>
) : RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val itemCharacterView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruits_item, parent, false)
        return FruitsViewHolder(itemCharacterView)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.bindFruits(FruitList[position])
    }

    override fun getItemCount(): Int {
        return FruitList.size
    }

    //----------------------------------------------------------------------------------//
    inner class FruitsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var fruitName: TextView
        private var fruitImage: ImageView
        private var fruitDesc: TextView?

        init {
            fruitName = itemView.findViewById(R.id.Fruits_name)
            fruitImage = itemView.findViewById(R.id.Fruits_image)
            fruitDesc = itemView.findViewById(R.id.Fruit_Describtion)

            itemView.setOnClickListener {
                val currentFruit = FruitList[layoutPosition]
                val FruitObj = Fruits(currentFruit.name , currentFruit.image , currentFruit.ShortDesc)
                val intent: Intent = Intent(itemView.context , FruitDetailsActivity::class.java).apply {
                    putExtra("Fruit" , FruitObj)
                }


                itemView.context.startActivity(intent)
            }
        }

        fun bindFruits(fruits: Fruits) {
            fruitName.text = fruits.name
            fruitImage.setImageResource(fruits.image)
            fruitDesc?.text = fruits.ShortDesc
        }
    }
}