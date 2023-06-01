package com.example.sumadedosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textView1: TextView = findViewById(R.id.resultado2)
        val receivedMessage:String = intent.extras?.getString("EXTRA_MESSAGE").orEmpty()
        textView1.text = receivedMessage
    }

}