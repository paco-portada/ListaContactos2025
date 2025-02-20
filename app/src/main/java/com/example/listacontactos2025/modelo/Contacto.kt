package com.example.listacontactos2025.modelo

import com.google.gson.annotations.SerializedName

data class Contacto(
    @SerializedName("name")
    val nombre: String,
    @SerializedName("address")
    val direccion: String,
    @SerializedName("city")
    val ciudad: String,
    @SerializedName("phones")
    val telefono: Telefono
)
