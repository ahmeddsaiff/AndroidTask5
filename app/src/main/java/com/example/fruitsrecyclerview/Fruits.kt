package com.example.fruitsrecyclerview

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fruits(val name: String, val image: Int, val ShortDesc: String?) : Parcelable



