package io.github.maylcf.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById<AppCompatButton>(R.id.set_event_button)
        btnSetEvent.setOnClickListener {
        }
    }
}