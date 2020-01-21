package br.com.giovana.estaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        //Habilitar o Javascript, dentro do WebView
        wbvSite.settings.javaScriptEnabled = true
        wbvSite.loadUrl("http://br.cellep.com/")
    }
}
