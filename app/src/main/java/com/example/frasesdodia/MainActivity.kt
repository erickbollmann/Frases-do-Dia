package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

   lateinit var texto: TextView
    val frases = arrayOf(
       "Até que a cor da pele de um homem não tenha mais significado que a cor dos seus olhos, eu digo que haverá guerra. Bob Marley",
        "Libertem-se da escravidão mental! Ninguém, além de nós mesmos, pode libertar nossas mentes. Bob Marley",
        "Para declarar guerra, não é necessario criar inimigos, basta dizer o que pensa. Martin Luther King",
        "Seja a diferença que quer ver no mundo. MS",
        "Não ganhe o mundo e perca sua alma; sabedoria é melhor que prata e ouro. Robert Nesta Marley",
        "Se Deus criou as pessoas para amar e as coisas para cuidar, por que amamos as coisas e usamos as pessoas?",
        "Se a caminhada está difícil, é porque você está no caminho certo.",
        "Você é mais corajoso do que pensa, mais forte do que parece e mais esperto do que acredita.",
        "Se ta doendo, é porque você ta no caminho certo.",
        "O que você sabe não tem valor; o valor está no que você faz com o que sabe. Bruce Lee",
        "Não reze por uma vida fácil, reze por forças para suportar uma difícil.",
        "Seja frágil como a água, mas com capacidade de destruir uma rocha.",
        "O nada é responsável pelo tudo, sem ele não haveria o universo.",
        "Coragem é saber o que não temer.",
        "Acredite em milagres, mas não dependa deles.",
        "Não é a carga que o derruba, mas a maneira como você a carrega.",
        "A vida é 10% o que acontece a você e 90% como você reage a isso."

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView


    }

    fun gerarFrase(view: View){
        val totalIntensArray = frases.size

        val numeroAleatorio = Random().nextInt( totalIntensArray )

        texto.setText( frases [ numeroAleatorio ])
    }

}