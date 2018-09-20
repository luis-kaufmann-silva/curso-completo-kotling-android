package com.kaufmann.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cliente.setOnClickListener {
            Toast.makeText(applicationContext, "Abrindo cliente!", Toast.LENGTH_SHORT)
                    .show()
            startActivity(Intent(this, DetalheClienteActivity::class.java))
        }

        btn_contato.setOnClickListener {
            Toast.makeText(applicationContext, "Abrindo contato!", Toast.LENGTH_SHORT)
                    .show()
            startActivity(Intent(this, DetalheContatoActivity::class.java))
        }

        btn_empresa.setOnClickListener {
            Toast.makeText(applicationContext, "Abrindo empresa!", Toast.LENGTH_SHORT)
                    .show()
            startActivity(Intent(this, DetalheEmpresaActivity::class.java))
        }

        btn_servico.setOnClickListener {
            Toast.makeText(applicationContext, "Abrindo servico!", Toast.LENGTH_SHORT)
                    .show()
            startActivity(Intent(this, DetalheServicosActivity::class.java))
        }

    }


}
