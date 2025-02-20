package com.example.listacontactos2025.modelo

import com.google.gson.annotations.SerializedName

data class Telefono(
    @SerializedName("landline")
    val casa: String,
    @SerializedName("mobile")
    val movil: String,
    @SerializedName("work")
    val trabajo: String
)