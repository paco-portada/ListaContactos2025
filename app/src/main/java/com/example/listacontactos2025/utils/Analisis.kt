package com.example.listacontactos2025.utils

import com.example.listacontactos2025.modelo.Contacto
import com.example.listacontactos2025.modelo.Telefono
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

object Analisis {

    @Throws(JSONException::class)
    fun analizarContactos(cadena: String?): ArrayList<Contacto> {
        val jAcontactos: JSONArray
        val objeto: JSONObject
        var jOcontacto: JSONObject
        var jOtelefono: JSONObject
        var contacto: Contacto
        var telefono: Telefono
        val personas = ArrayList<Contacto>()
        // añadir contactos (en formato JSON) a personas
        objeto = JSONObject(cadena)
        jAcontactos = objeto.getJSONArray("contactos")
        for (i in 0 until jAcontactos.length()) {
            jOcontacto = jAcontactos.getJSONObject(i)
            jOtelefono = jOcontacto.getJSONObject("phones")
            telefono = Telefono(jOtelefono.getString("landline"), jOtelefono.getString("mobile"), jOtelefono.getString("work"))
            contacto = Contacto(jOcontacto.getString("name"), jOcontacto.getString("address"), jOcontacto.getString("city"), telefono)
            personas.add(contacto)
        }
        return personas
    }
}