package com.ferdsapp.newsapp.presentation.onBoarding

import androidx.annotation.DrawableRes

data class page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf
