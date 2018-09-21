package com.kaufmann.passandodados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_passar_dados.setOnClickListener {
            val intent = Intent(applicationContext, SegundaActivity::class.java)
            intent.putExtra("nome", "Luis")
            intent.putExtra("idade", "26")
            startActivity(intent)
        }

    }
}
