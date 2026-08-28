package com.example.esse

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class outraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_outra_tela)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        val texto = findViewById< TextView>(R.id.txt)
        texto.text = "Título: $titulo\nAutor: $autor"
        }
    }
