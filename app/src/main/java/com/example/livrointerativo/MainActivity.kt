package com.example.livrointerativo

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvSignUp: TextView
    private lateinit var tvForgotPassword: TextView
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)

        tvSignUp = findViewById(R.id.tvSignUp)
        tvForgotPassword = findViewById(R.id.tvForgotPassword)
        btnLogin = findViewById(R.id.btnLogin)

        tvSignUp.setOnClickListener {
            startActivity(Intent(this, CriarContaActivity::class.java))
        }

        tvForgotPassword.setOnClickListener {
            startActivity(Intent(this, EsqueciSenhaActivity::class.java))
        }

        btnLogin.setOnClickListener {
            // Aqui você pode validar email e senha
            startActivity(Intent(this, TelaOpcoesActivity::class.java))
        }
    }
}
