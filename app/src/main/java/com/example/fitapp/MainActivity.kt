package com.example.fitapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton = findViewById<Button>(R.id.button)
        boton.setOnClickListener{val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }



    }

    override fun onResume() {
        super.onResume()
        val historial = (this.application as Myapp).getUseLap()
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, historial.lapHistory)
        val listView = findViewById<ListView>(R.id.list_view_1)
        listView.adapter = adapter
        adapter.notifyDataSetChanged()

        val eliminar =findViewById<Button>(R.id.button2)
        eliminar.setOnClickListener{
            historial.clear()
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Se ha eliminado todo el historial" , Toast.LENGTH_SHORT).show()
        }
        listView.setOnItemLongClickListener { parent, view, position, id ->
            historial.del(position)
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Se elimino un elemento de tu historial" , Toast.LENGTH_SHORT).show()
            true
        }
    }
}
