package com.example.android_lab_3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(
    private val contactList: List<Contact>,
    private val context: Context
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        holder.contactName.text = contact.name

        holder.callButton.setOnClickListener {
            Toast.makeText(context, "Calling ${contact.name}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = contactList.size

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactName: TextView = itemView.findViewById(R.id.contactName)
        val callButton: Button = itemView.findViewById(R.id.callButton)
    }
}