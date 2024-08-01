package com.example.primeropasoskotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.primeropasoskotlin.models.Productos

class MainActivity : AppCompatActivity() {

    lateinit var btnCal:Button
    lateinit var txtPrecio:EditText
    lateinit var tvResul:TextView
    lateinit var spList: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //codigo
        cargarR()
        estadoButon()

        val listaPaises= arrayOf("USA","BOL","ESP")
        val listaIVAAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listaPaises)
        spList.adapter=listaIVAAdapter

    }
    //funcion para cargar R
    fun cargarR (){
        btnCal = findViewById(R.id.btnCalcular)
        txtPrecio = findViewById(R.id.txtPrecio)
        tvResul = findViewById(R.id.tvResultado)
        spList = findViewById(R.id.spListaPaises)
    }

    //estados de botton
    fun estadoButon(){
        btnCal.setOnClickListener(){
            var precio: Double = txtPrecio.text.toString().toDouble()
            val laptop = Productos("Laptop", precio)
            when(spList.selectedItem.toString()){
                "USA" -> tvResul.text = laptop.calcularIVA(0.03).toString()
                "BOL" -> tvResul.text = laptop.calcularIVA(0.13).toString()
                "ESP" -> tvResul.text = laptop.calcularIVA(0.05).toString()
            }

        }
    }
}