package com.example.tp2juanignaciodominguez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Veterinaria : AppCompatActivity() {

    lateinit var tvNombre: TextView
    lateinit var tvTipo: TextView
    lateinit var btnVet1: Button
    lateinit var btnVet2: Button
    lateinit var etCausa:EditText
    lateinit var etDiagnostico:EditText
    lateinit var etMedicamento:EditText
    lateinit var etTratamiento:EditText
    lateinit var rbRep1:RadioButton
    lateinit var rbRep2:RadioButton
    var contadorAtendidoCaja1:Int=0
    var contadorAtendidoCaja2:Int=0
    val lista:ArrayList<String> = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_veterinaria)
         etCausa= findViewById(R.id.eCausa)
         etDiagnostico= findViewById(R.id.eDiagnostico)
         etMedicamento= findViewById(R.id.eMedicamento)
         etTratamiento= findViewById(R.id.eTratamiento)
         rbRep1= findViewById(R.id.rbReposo1)
         rbRep1= findViewById(R.id.rbReposo2)



        val nombre:String = intent.getStringExtra("Nombre").toString()
        tvNombre = findViewById(R.id.tvNombre)
        tvNombre.setText(nombre)
        val tipo:String = intent.getStringExtra("tipo").toString()
        tvTipo = findViewById(R.id.tvTipo)
        tvTipo.setText(tipo)


        btnVet1.setOnClickListener(View.OnClickListener {
            if(contadorAtendidoCaja1 <3){
                lista.add("Atendido Caja 1")
                Toast.makeText(this,"Animal Atendido por Juan ", Toast.LENGTH_SHORT).show()
                contadorAtendidoCaja1++
                etCausa.text.clear()
                etDiagnostico.text.clear()
                etMedicamento.text.clear()
                etTratamiento.text.clear()
                rbRep1.isChecked = false
                rbRep2.isChecked =false


            }else{
                Toast.makeText(this,"No hay mas turnos con Juan", Toast.LENGTH_SHORT).show()
                btnVet1.isEnabled=false
            }
        })
             btnVet2.setOnClickListener(View.OnClickListener {
             if(contadorAtendidoCaja2<5 ){
                 lista.add("Atendido Caja 2" + tvNombre.text.toString() + tvTipo.text.toString())
                 Toast.makeText(this,"Animal Atendido por Pedro ", Toast.LENGTH_SHORT).show()
                 contadorAtendidoCaja1++
                etCausa.text.clear()
                 etDiagnostico.text.clear()
                 etMedicamento.text.clear()
                 etTratamiento.text.clear()
                 rbRep1.isChecked = false
                 rbRep2.isChecked =false


             }else{
                 Toast.makeText(this,"No hay mas turnos con Pedro", Toast.LENGTH_LONG).show()
                 btnVet2.isEnabled=false
             }
         })
    }
}