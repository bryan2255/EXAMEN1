package com.example.sumadedosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btn: Button = findViewById(R.id.iniciar)
    btn.setOnClickListener{

        val intent: Intent = Intent(this, operacion_suma:: class.java)
        startActivity(intent)

        }
    }

}