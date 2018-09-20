package com.kaufmann.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cliente.setOnClickListener {
            startActivity(Intent(this, DetalheClienteActivity::class.java))
        }

        btn_contato.setOnClickListener {
            startActivity(Intent(this, DetalheContatoActivity::class.java))
        }

        btn_empresa.setOnClickListener {
            startActivity(Intent(this, DetalheEmpresaActivity::class.java))
        }

        btn_servico.setOnClickListener {
            startActivity(Intent(this, DetalheServicosActivity::class.java))
        }

    }


}
