package com.example.retrofit_salma_30.model

import com.google.gson.annotations.SerializedName

data class IndonesiaResponse(
    val name: String,
    val positif: String,
    val sembuh: String,
    val meninggal: String,
    val dirawat: String
)