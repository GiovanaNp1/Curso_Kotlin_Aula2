package br.com.giovana.estaohack

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

            if(usuario.isEmpty()){
                txvResultado.text = "Usuário está vazio!!!"
            } else if(senha.isEmpty()){
                txvResultado.text = "Senha está vazia!!!"
            }else if(usuario == "Giovana" && senha == "batata1234"){
                txvResultado.text = "Usuario logado com sucesso :D"
            }else{
                Toast.makeText(this@LoginActivity, "Usuário ou senha incorretos :(", Toast.LENGTH_LONG).show()
            }

        }

        btnCadastrar.setOnClickListener{
            startActivity(Intent(this@LoginActivity, CadastroActivity::class.java))
        }

    }
}
