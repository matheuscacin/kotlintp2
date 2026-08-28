package com.example.esse

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


                val titulo = findViewById<EditText>(R.id.titulo)
                val autor = findViewById<EditText>(R.id.autor)
                val botaoCadastrar = findViewById<Button>(R.id.btnCadastrar)


                botaoCadastrar.setOnClickListener {
                    botaoCadastrar.setOnClickListener {
                        val outraTela = Intent(this, outraTela::class.java)

                        outraTela.putExtra("titulo", titulo.text.toString())
                        outraTela.putExtra("autor", autor.text.toString())

                        startActivity(outraTela)
                }
            }
        }

}

