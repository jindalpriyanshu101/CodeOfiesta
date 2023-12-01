package com.elementix.codeofiesta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

        val actionBar = supportActionBar

        actionBar!!.title = "Second page hai bhai"
    }
}