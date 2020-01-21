package br.com.giovana.estaohack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.edtNome

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Abrindo o Shared Preferences
        val minhaPreferencia = getSharedPreferences("minha-preferencia", Context.MODE_PRIVATE)
        //Recuperando dados da Shared Preference
        val nome = minhaPreferencia.getString("nome", "Erro preferences")
        val sobrenome = minhaPreferencia.getString("sobrenome", "Erro preferences")
        val email = minhaPreferencia.getString("email", "Erro preferences")
        val sexo = minhaPreferencia.getString("sexo", "Erro preferences")

        //Colocando na tela os dados recuperados
        edtNome.text = "$nome $sobrenome"
        txvEmail.text = email
        txvSexo.text = sexo

        btnSair.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finishAffinity()
        }

        btnSite.setOnClickListener {
            startActivity(Intent(this@MainActivity, WebActivity::class.java))
            finishAffinity()
        }
        }
}