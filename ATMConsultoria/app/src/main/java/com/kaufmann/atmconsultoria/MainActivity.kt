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

        Toast.makeText(applicationContext, "On Create!!", Toast.LENGTH_LONG).show()

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


    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "On Start!!", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "On Resume!!", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "On Pause!!", Toast.LENGTH_LONG).show()
    }


    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "On Stop!!", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "On Restart!!", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "On Destroy!!", Toast.LENGTH_LONG).show()
    }




}
