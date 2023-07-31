package com.example.a02_primeiraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.a02_primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.buttonOla.setOnClickListener {
            binding.editNome.setText("Olá")
        }
        binding.textResultado.setOnClickListener {
            binding.editNome.setText("Xau Laura")
        }*/
     binding.buttonOla.setOnClickListener {
         var nome = binding.editNome.text.toString()
         binding.textResultado.setText("Olá${Nome}")
         //binding.textResultado.setText("Olá" + Nome)
     }
    }
}