package com.example.a05_ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_ex4.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Button.setOnClickListener {
            val numero = binding.editText.text.toString().toInt()

            if (numero % 2 == 0){
                binding.parImpar.text = "É par"
            }
            else{
                binding.parImpar.text = "É Ímpar"
            }

            if (isPrime (numero)){
                binding.primo.text = "É primo"
            }
            else{
                binding.primo.text = "Não é primo"
            }
        }
    }
    private fun isPrime(numero:Int): Boolean{
        if (numero<=1){
            return false
        }
        for (i in 2..sqrt(numero.toDouble()).toInt()){
            if (numero % i==0){
                return false
            }
        }
        return true
    }
}