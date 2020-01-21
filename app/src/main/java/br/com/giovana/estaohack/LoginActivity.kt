package br.com.giovana.estaohack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //Criação a ação do Clique Do Botão Entrar:

        btnEntrar.setOnClickListener {
            val usuario = edtUsuario.text.toString().trim()
            val senha = edtSenha.text.toString().trim()
            val minhaPreferencia = getSharedPreferences("minha-preferencia", Context.MODE_PRIVATE)
            val email = minhaPreferencia.getString("email", "Erro preferences")
            val senhaSalva = minhaPreferencia.getString("senha", "Erro preference")

            if(usuario.isEmpty()){
                txvResultado.text = "Usuário está vazio!!!"
            } else if(senha.isEmpty()){
                txvResultado.text = "Senha está vazia!!!"
            }else if(senha == senhaSalva && email == usuario){
                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            }else{
                txvResultado.text = "Usuario ou senha incorretos"
            }

        }

        btnCadastrar.setOnClickListener{
            startActivity(Intent(this@LoginActivity, CadastroActivity::class.java))
        }

    }
}
