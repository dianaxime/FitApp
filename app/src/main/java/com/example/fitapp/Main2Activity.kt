package com.example.fitapp

import Models.Controlador
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val boton = findViewById<Button>(R.id.button6)
        boton.setOnClickListener{this.finish()}
        val predef: ArrayList<String> = arrayListOf("1 vuelta", "3 vueltas", "5 vueltas", "10 vueltas")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, predef)
        val listView = findViewById<ListView>(R.id.list_view_2)
        listView.adapter = adapter
        val agregar =findViewById<Button>(R.id.agregar)
        agregar.setOnClickListener{
            val historial = (this.application as Myapp).getUseLap()
            val numvueltas = findViewById<TextView>(R.id.textView)
            val elemento=numvueltas.text.toString()
            historial.add(Integer.parseInt(elemento))
            Toast.makeText(this, "Se añadio exitosamente" , Toast.LENGTH_SHORT).show()
        }
        val sumar =findViewById<Button>(R.id.button4)
        sumar.setOnClickListener{
            val numvueltas = findViewById<TextView>(R.id.textView)
            val elemento=numvueltas.text.toString()
            var n=Integer.parseInt(elemento)
            n++
            numvueltas.text = n.toString()
        }
        val restar =findViewById<Button>(R.id.button3)
        restar.setOnClickListener{
            val numvueltas = findViewById<TextView>(R.id.textView)
            val elemento=numvueltas.text.toString()
            var n=Integer.parseInt(elemento)
            if (n > 0) {
                n--
            }
            else{
                Toast.makeText(this, "No es posible agregar menos de 0 vueltas" , Toast.LENGTH_SHORT).show()
            }
            numvueltas.text = n.toString()
        }
        listView.setOnItemLongClickListener { parent, view, position, id ->
            val numvueltas = findViewById<TextView>(R.id.textView)
            if (position==0)
            {
                numvueltas.text="1"
            }
            else if (position==1)
            {
                numvueltas.text="3"
            }
            else if (position==2)
            {
                numvueltas.text = "5"
            }
            else if (position==3)
            {
                numvueltas.text = "10"
            }
            true
        }
    }

}
