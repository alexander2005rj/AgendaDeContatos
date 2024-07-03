package com.exemplo.agendadecontatos

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

object ContactList {
    private val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact) {
        contacts.add(contact)
    }

    fun getContacts(): List<Contact> {
        return contacts
    }
}

class ListContactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_contacts)

        val contactsListView = findViewById<ListView>(R.id.contactsListView)
        val contacts = ContactList.getContacts()

        val contactsInfo = contacts.map { "${it.name} ${it.lastName}\n${it.address}" }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contactsInfo)
        contactsListView.adapter = adapter
    }
}
