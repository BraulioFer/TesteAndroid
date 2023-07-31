package com.example.a05_ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a05_ex2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonGo.setOnClickListener {
            val username = binding.editTextUsername.text.toString()
            val password = binding.editTextPassword.text.toString()
            if (username.isEmpty()){
                Toast.makeText(applicationContext, "Inserir Username",Toast.LENGTH_SHORT).show()
            }
            else if (password.isEmpty()){
                Toast.makeText(applicationContext, "Insira a Password",Toast.LENGTH_SHORT).show()
            }
            else if (username == "User" && password == "Pass") {
                val intent = Intent(this, LoginOkActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this,LoginErradoActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext,"Login Errado",Toast.LENGTH_SHORT).show()
            }
        }


    }
}