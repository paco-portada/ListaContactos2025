package com.example.listacontactos2025.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listacontactos2025.R
import com.example.listacontactos2025.databinding.ItemContactBinding
import com.example.listacontactos2025.modelo.Contacto

class ContactosAdapter(private var mContactos: List<Contacto>) : RecyclerView.Adapter<ContactosAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemContactBinding.bind(itemView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_contact, parent, false)

        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val contact = mContactos[position]

        // Set item views based on your views and data model
        holder.binding.contactName.text = contact.nombre
        holder.binding.mobilePhone.text = contact.telefono.movil
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return mContactos.size
    }

    fun actualizar(data: List<Contacto>) {
        mContactos = data
        notifyDataSetChanged()
    }
}