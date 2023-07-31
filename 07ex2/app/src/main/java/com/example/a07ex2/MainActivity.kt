package com.example.a07ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.a07ex2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lista_valores = ArrayList<Int>()
        lista_valores.add(1)
        lista_valores.add(2)
        lista_valores.add(3)
        lista_valores.add(4)
        lista_valores.add(5)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista_valores)
        binding.listaValores.adapter = arrayAdapter

        binding.buttonAdicionar.setOnClickListener {
            val valor = binding.editValores.text.toString().toInt()
            lista_valores.add(valor)
            arrayAdapter.notifyDataSetChanged()
        }
    }
}