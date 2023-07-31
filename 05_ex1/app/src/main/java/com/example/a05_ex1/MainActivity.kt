package com.example.a05_ex1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a05_ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            Toast.makeText(applicationContext,"Botão Clicado", Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, segundoActivity::class.java)
            startActivity(intent)
        }



    }
}