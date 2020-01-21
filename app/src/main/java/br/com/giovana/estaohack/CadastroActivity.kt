package br.com.giovana.estaohack

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        /*
            Criando o Shared Preferences:
            Sâo necessarios dois parametros dentro dos parênteses
            1 - Nomde do arquivo a ser criado
            2 - o modo de acesso dele
        */

        val minhaPreferencia = getSharedPreferences("minha-preferencia", Context.MODE_PRIVATE)

        // Criando o Editor de SharedPreferences

        val meuEditor = minhaPreferencia.edit()

        val listaSexo = arrayListOf("Selecione o sexo", "Feminino", "Masculino")

        //Criando o Adaptador do spinner
        val adapterSexo = ArrayAdapter(
            this@CadastroActivity,
            android.R.layout.simple_spinner_dropdown_item, listaSexo
        )

        //Adicionando o adaptador ao spinner da tela
        spnSexo.adapter = adapterSexo

        //Evento do clique do botão
        btnCadastrar.setOnClickListener {
            //Recuperando os valores digitados pelo usuário e armazenando em variaveis
            val nome = edtNome.text.toString().trim()
            val sobrenome = edtSobrenome.text.toString().trim()
            val email = edtEmail.text.toString().trim().toLowerCase()
            val senha = edtSenha.text.toString().trim()

            //Validando se todos os campos estão preenchidos e se o sexo foi selecionado
            if(nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                // Imprimindo uma mensagem de erro
                Toast.makeText(this@CadastroActivity, "Preencha todos os campos" , Toast.LENGTH_LONG).show()
            } else if(spnSexo.selectedItem == "Selecione o sexo"){
               Toast.makeText(( this@CadastroActivity, "Sexo não selecionado", Toast.LENGTH_LONG).show()
            }
        }
    }
}
