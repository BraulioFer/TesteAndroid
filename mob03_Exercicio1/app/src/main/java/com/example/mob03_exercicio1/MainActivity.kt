package com.example.mob03_exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mob03_exercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val Nome = binding.editTextNome.text.toString()
            val apelido = binding.editTextApelido.text.toString()
            if (Nome == "" && apelido == ""){
                //if(nome.isEmpty() ou || snome.isEmpty()) { ...}
              //  binding.Resultado.text = "Tem de inserir Nome e Apelido"
                Toast.makeText(applicationContext, "Olá ${Nome} ${apelido}", Toast.LENGTH_LONG).show()
            }
            else {
               // binding.Resultado.text = "Olá ${Nome} ${apelido}"

            Toast.makeText(applicationContext,  "Olá ${Nome} ${apelido}", Toast.LENGTH_LONG).show()
            }
        }
    }
}