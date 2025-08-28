package com.seunome.empresa.projetoosorio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.seunome.empresa.projetoosorio.ui.theme.ProjetoOsorioTheme

class PrimeiraTela : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MinhaTela()
        }
    }
}

@Preview
@Composable
fun MinhaTela(){

    Scaffold {
        innerPadding ->

        val context = LocalContext.current

        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text("Tela 01")
            BotaoAlerta(context)
            MudarTelaSimples(context)
            MudarTelaComInformacao(context)
        }

    }
}

@Composable
private fun MudarTelaSimples(context: Context) {
    Button(onClick = {
        val intent = Intent(
            context,
            SegundaTela::class.java
        )

        context.startActivity(intent)
    }) {
        Text("Mudar de Tela :)")
    }
}

@Composable
private fun MudarTelaComInformacao(context: Context) {
    val nomeItem = "Batata Frita"
    
    Button(onClick = {

        val intent = Intent(context,SegundaTela::class.java)

        intent.putExtra("nome2", nomeItem)

        context.startActivity(intent)

    }) {
        Text("Mudar de Tela :)")
    }
}

@Composable
private fun BotaoAlerta(context: Context) {
    Button(
        onClick = {
            Toast.makeText(
                context,
                "Testando o Botao!",
                Toast.LENGTH_LONG
            ).show()
        }
    ) {
        Text("Teste Botao")
    }
}

