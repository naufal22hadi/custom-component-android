package com.example.project1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val text : TextView get() = findViewById(R.id.lionParcelTextView)
    private val button : Button get() = findViewById(R.id.lionParcelButton)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.text = "Naufal Hadi"
        button.text = "Press me!"
    }
}
