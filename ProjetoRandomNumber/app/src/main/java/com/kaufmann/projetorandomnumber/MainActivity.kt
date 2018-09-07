package com.kaufmann.projetorandomnumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickBotao(view: View){
        val texto = findViewById(R.id.texto) as TextView
        texto.setText("Texto alterado")

    }
}
