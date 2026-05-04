package com.example.imadassignment2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This connects my Kotlin file to the welcome screen layout
        setContentView(R.layout.activity_main)

        // This connects the button from XML to Kotlin
        val btnStart = findViewById<Button>(R.id.btnStart)

        // When the user clicks the button, the app goes to the question screen
        btnStart.setOnClickListener {
            Log.d("MAIN_ACTIVITY", "User clicked Begin Challenge")

            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
        }
    }
}