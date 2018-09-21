package com.kaufmann.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_jogar.setOnClickListener {
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            intent.putExtra("resultado", Random().nextBoolean())
            startActivity(intent)
        }

    }
}
