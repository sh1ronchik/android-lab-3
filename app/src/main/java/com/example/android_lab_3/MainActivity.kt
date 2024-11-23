package com.example.android_lab_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val contactList = listOf(
            Contact("Андрей"),
            Contact("Виктория"),
            Contact("Олег"),
            Contact("Мария"),
            Contact("Дмитрий")
        )

        contactAdapter = ContactAdapter(contactList, this)
        recyclerView.adapter = contactAdapter
    }
}