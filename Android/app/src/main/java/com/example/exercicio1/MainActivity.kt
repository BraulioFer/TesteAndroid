package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicio1.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros = binding.textConversao.text.toString().toDouble()
            val dolares = (euros * 0.8 * 100).roundToInt().toDouble()/100
            binding.textResultado.setText("${dolares} $")}



    }
}