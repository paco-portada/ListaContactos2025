package com.example.listacontactos2025.modelo

data class Contacto (
    var nombre: String,
    var direccion: String,
    var ciudad: String,
    // var email: String,
    var telefono: Telefono
)
