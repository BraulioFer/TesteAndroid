package com.example.a05_multiplesactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_multiplesactivity.databinding.ActivityMainBinding
import com.example.a05_multiplesactivity.databinding.ActivitySegundoBinding

class segundoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonSegundo.setOnClickListener {
            val intent = Intent(this, ActivityMainBinding::class.java)
            finish()
        }


    }
}