package com.kaufmann.alcoolougasolina

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun calcular(view: View) {
        var precoAlcool = edit_text_alcool.text.toString()
        var precoGasolina = edit_text_gasolina.text.toString()

        if (precoAlcool == "") {
            text_view_resultado.text = "Valores inválidos"
        } else if (precoGasolina == "") {
            text_view_resultado.text = "Valores inválidos"
        } else {
            val melhor = if (precoAlcool.toDouble() / precoGasolina.toDouble() >= .7) "Gasolina" else "Álcool"
            text_view_resultado.text = "Utilize $melhor"
        }


    }
}
