package br.com.giovana.estaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Setando um tempo na tela de splash, para a tela de login

        Handler().postDelayed({
            //abrir tlea de login
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            //Finalizando a splash
            finish()
        }, 3000)
    }
}
