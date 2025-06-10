package com.example.livrointerativo
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class EsqueciSenhaActivity : AppCompatActivity() {
    private lateinit var btnCadastrar: Button
    private lateinit var btnEnviarRecuperacao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.esqueci_senha)

        btnEnviarRecuperacao = findViewById(R.id.btnEnviarRecuperacao)

        btnEnviarRecuperacao.setOnClickListener {
            Toast.makeText(this, "Email de recuperação enviado!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
