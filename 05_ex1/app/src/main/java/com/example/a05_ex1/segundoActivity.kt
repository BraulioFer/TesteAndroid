package com.example.a05_ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_ex1.databinding.ActivityMainBinding
import com.example.a05_ex1.databinding.ActivitySegundoBinding

class segundoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView2.setOnClickListener {
            finish()
        }

    }
}
