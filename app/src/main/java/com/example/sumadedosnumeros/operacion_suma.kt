package com.example.sumadedosnumeros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class operacion_suma : AppCompatActivity() {
    lateinit var edtNum1: EditText
    lateinit var edtNum2 : EditText
    lateinit var btnSumar : Button
    lateinit var txtresultado : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacion_suma)
        val edittext1: TextView = findViewById(R.id.resultado)

        edtNum1 = findViewById(R.id.editTextNumber)
        edtNum2 = findViewById(R.id.editTextNumber2)
        btnSumar = findViewById(R.id.suma)
        txtresultado = findViewById(R.id.resultado)

        btnSumar.setOnClickListener(View.OnClickListener   {

            try {

                val num1 = Integer.parseInt(edtNum1.text.toString())
                val num2 = Integer.parseInt(edtNum2.text.toString())

                txtresultado.setText("resultado: " + sumar(num1, num2))
            }catch (ex: Exception){}
                val message:String = edittext1.text.toString()
                val sendMessage = Intent(this, resultado::class.java)
                sendMessage.putExtra("EXTRA_MESSAGE", message )
                startActivity(sendMessage)
        })

        val btn2: Button = findViewById(R.id.vinicio)
    btn2.setOnClickListener{

        val intent: Intent = Intent(this, MainActivity:: class.java)
        startActivity(intent)
    }
  }
   fun sumar (numero1: Int, numero2: Int): Int {

       return numero1 + numero2
   }
}