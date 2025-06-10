package com.example.livrointerativo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity

class TelaOpcoesActivity : AppCompatActivity() {

    private lateinit var cardAlfabetizacao: CardView
    private lateinit var cardBoasManeiras: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        cardAlfabetizacao = findViewById(R.id.card_alfabetizacao)
        cardBoasManeiras = findViewById(R.id.card_boas_maneiras)

        cardAlfabetizacao.setOnClickListener {
            startActivity(Intent(this, AlfabetizacaoActivity::class.java))
        }

        cardBoasManeiras.setOnClickListener {
            startActivity(Intent(this, BoasManeirasActivity::class.java))
        }
    }
}
