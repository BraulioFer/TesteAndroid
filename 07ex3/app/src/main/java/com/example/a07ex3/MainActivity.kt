package com.example.a07ex3

import android.content.Intent
import android.graphics.ColorSpace.Adaptation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.a07ex3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val lista = ArrayList<Aluno>()
        lista.add(Aluno("Bráulio", " Rua zau zau", "brauliomelofer@gmail.com"))
        lista.add(Aluno("Rita Maquinista", " Rua sobe tudo", "ritaMaquinista@gmail.com"))
        lista.add(Aluno("Marina","asd asdas" , "marina123@gmail.com"))

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,lista)
        binding.ListaAlunos.adapter= arrayAdapter

        binding.ListaAlunos.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this,segundoActivity::class.java)
            intent.putExtra("nome",lista[i].nome)
            intent.putExtra("morada",lista[i].morada)
            intent.putExtra("email",lista[i].email)
            startActivity(intent)
        }
        }


}