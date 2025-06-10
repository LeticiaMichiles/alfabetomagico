package com.example.livrointerativo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class CriarContaActivity : AppCompatActivity() {

    private lateinit var btnCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.criar_conta)

        btnCadastrar = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            // Após cadastrar, pode voltar para o login
            finish()
        }
    }
}
