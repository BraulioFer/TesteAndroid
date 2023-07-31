package com.example.a05_ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_ex2.databinding.ActivityLoginErradoBinding
import com.example.a05_ex2.databinding.ActivityLoginOkBinding

class LoginErradoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginErradoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonBack.setOnClickListener {
            finish()
        }

    }
}