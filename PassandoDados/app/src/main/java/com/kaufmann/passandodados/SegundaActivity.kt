package com.kaufmann.passandodados

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

/*
    -> Java:
    Bundle extras = getIntent().getExtras();
    TextView text_nome = (TextView)findViewById(R.id.text_nome)
    text_nome.setText(extras.getString("nome"))
    -> Kotlin:
    text_nome.text = intent.extras["nome"] as String

 */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        text_nome.text = intent.extras["nome"] as String
        text_idade.text = intent.extras["idade"] as String

    }
}
