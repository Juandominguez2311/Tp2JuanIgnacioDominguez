package com.example.tp2juanignaciodominguez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b: Button = findViewById(R.id.btnEnviar)

        val perro: RadioButton = findViewById(R.id.rbPerro)
        val conejo: RadioButton = findViewById(R.id.rbConejo)

        b.setOnClickListener(View.OnClickListener {
        if(perro.isChecked){
                val intent: Intent = Intent(this, Veterinaria::class.java)
                val nombre: EditText = findViewById(R.id.edNombre)
                val nombreaPasar = nombre.text.toString()
                val tipo = "Perro"
                intent.putExtra("Nombre",nombreaPasar)
                intent.putExtra("tipo",tipo)
                startActivity(intent)
            }else if(conejo.isChecked){
                val intent: Intent = Intent(this, Veterinaria::class.java)
                val nombre: EditText = findViewById(R.id.edNombre)
                val nombreaPasar = nombre.text.toString()
                val tipo = "Conejo"
                intent.putExtra("Nombre",nombreaPasar)
                intent.putExtra("tipo",tipo)
                startActivity(intent)
            }else{
                val intent: Intent = Intent(this, Veterinaria::class.java)
                val nombre: EditText = findViewById(R.id.edNombre)
                val nombreaPasar = nombre.text.toString()
                val tipo = "Gato"
                intent.putExtra("Nombre",nombreaPasar)
                intent.putExtra("tipo",tipo)
                startActivity(intent)
            }

        })
    }
}