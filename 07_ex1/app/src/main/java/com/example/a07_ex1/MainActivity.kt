package com.example.a07_ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.a07_ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaNomes = ArrayList<String>()
        listaNomes.add("Maria")
        listaNomes.add("Manuel")
        listaNomes.add("Otávio")
        listaNomes.add("Bráulio")
        listaNomes.add("Nuno")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNomes)
        binding.listaNomes.adapter = arrayAdapter

        binding.listaNomes.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Olá ${listaNomes.get(i)}", Toast.LENGTH_SHORT).show()
        }
    }
}