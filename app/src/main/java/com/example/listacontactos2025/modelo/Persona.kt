package com.example.listacontactos2025.modelo
import com.google.gson.annotations.SerializedName

data class Persona(
    @SerializedName("contactos")
    val contactos: ArrayList<Contacto>
)