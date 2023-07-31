package com.example.a04_ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a04_ex3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.butaoReal.setOnClickListener {
            val euros = binding.editValor.text.toString().toDouble()
            val real = euros * 4.4
            Toast.makeText(applicationContext, "Reais: R$ ${real}",Toast.LENGTH_SHORT).show()
        }
        binding.butaoDolar.setOnClickListener {
            val euros = binding.editValor.text.toString().toDouble()
            val dolares = euros * 1.2
            Toast.makeText(applicationContext, "Dolares: $ ${dolares}",Toast.LENGTH_SHORT).show()
        }
        binding.butaoPeso.setOnClickListener {
            val euros = binding.editValor.text.toString().toDouble()
            val pesos = euros * 31.5
            Toast.makeText(applicationContext, "Pesos: P$ ${pesos}",Toast.LENGTH_SHORT).show()
        }

    }
}