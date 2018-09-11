package com.kaufmann.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*
import java.util.*

class HomeActivity : AppCompatActivity() {
    val frases = arrayOf(
            "Encare o que fez de errado com motivação, pois é isso que o ajudará a fazer certo da próxima vez.",
            "Não perca a motivação só porque as coisas não estão correndo como o previsto. Adversidade gera sabedoria e é isso que levará você ao sucesso.",
            "A motivação não acontece por acaso, como tudo na vida você tem de batalhar para a alcançar.",
            "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun gerarFrase(view: View){
        frase.text = frases[Random().nextInt(frases.size)]
    }

}
