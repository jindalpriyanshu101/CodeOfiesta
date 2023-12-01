package com.elementix.codeofiesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val actionBar = supportActionBar

        actionBar?.title = "4th page hai bhai"


        val recordbutton = findViewById<Button>(R.id.button9)

        recordbutton.setOnClickListener {
            showToast("Submission Recorded!")

        }
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}