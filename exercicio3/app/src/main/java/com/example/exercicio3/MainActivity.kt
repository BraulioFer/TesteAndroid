package com.example.exercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicio3.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val celcius = binding.editNumber.text.toString().toDouble()
            val fahr = (celcius * 1.8) + 32
            binding.resultadoConversao.text = "${fahr} f "
        }

    }
}