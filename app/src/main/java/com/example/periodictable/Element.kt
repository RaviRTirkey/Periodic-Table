package com.example.periodictable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Element(
    val index: Int,
    val atomicNumber: Int,
    val symbol: String,
    val name: String,
    val categoryColor: Int,
    val atomicMass: Double,
    val period: Int,
    val group: Int,
    val block: String,
    val stability: String
): Parcelable
