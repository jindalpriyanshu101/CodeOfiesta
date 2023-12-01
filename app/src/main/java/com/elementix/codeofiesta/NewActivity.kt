package com.elementix.codeofiesta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

        val actionBar = supportActionBar

        actionBar?.title = "Second page hai bhai"


        val submitButton = findViewById<Button>(R.id.button3)
        val newaccount = findViewById<Button>(R.id.button5)

        // Find EditText views by their IDs directly in the main layout
        val editText1 = findViewById<EditText>(R.id.editTextText)
        val editText2 = findViewById<EditText>(R.id.editText)

        submitButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            // Compare texts from both EditText views
            if (text1.equals(text2, ignoreCase = true)) {
                showToast("Login successful!\nWelcome $text1")
                val intent = Intent(this, NewActivity3::class.java)
                startActivity(intent)

            } else {
                showToast("Credentials do not match")
            }
        }

        newaccount.setOnClickListener {
            showToast("Welcome Aboard!")
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}
