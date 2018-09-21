package com.kaufmann.caraoucoroa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if (intent.extras["resultado"] as Boolean){
//            image_moeda.set
            image_moeda.setImageResource(R.drawable.moeda_cara)
        }else{
            image_moeda.setImageResource(R.drawable.moeda_coroa)
        }


        btn_voltar.setOnClickListener {
            finish()
        }
    }
}
