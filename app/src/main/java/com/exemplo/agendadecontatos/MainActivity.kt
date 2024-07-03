package com.exemplo.agendadecontatos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listButton = findViewById<Button>(R.id.listButton)
        val addButton = findViewById<Button>(R.id.addButton)

        listButton.setOnClickListener {
            val intent = Intent(this, ListContactsActivity::class.java)
            startActivity(intent)
        }

        addButton.setOnClickListener {
            val intent = Intent(this, AddContactActivity::class.java)
            startActivity(intent)
        }
    }
}
