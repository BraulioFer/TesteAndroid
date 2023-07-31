package com.example.a07ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a07ex3.databinding.ActivityMainBinding
import com.example.a07ex3.databinding.ActivitySegundoBinding

class segundoActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val nome = i.extras?.getString("nome")
        val morada = i.extras?.getString("morada")
        val email = i.extras?.getString("email")

        binding.dadosAlunos.text = "Nome: ${nome}\n" + "Morada: ${morada}\n" + "Email: ${email}"
    }
}