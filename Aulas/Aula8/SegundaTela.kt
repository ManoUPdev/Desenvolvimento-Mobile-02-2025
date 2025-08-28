package com.seunome.empresa.projetoosorio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.seunome.empresa.projetoosorio.ui.theme.ProjetoOsorioTheme

class SegundaTela : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Text("Segunda Tela - Uhul \\o/")

                val nomeItemRecebido = intent.getStringExtra("nome")

                if(nomeItemRecebido != null){
                    Text("Nome recebido: $nomeItemRecebido")
                }else{
                    Text("Nenhum nome recebido")
                }

            }
        }
    }
}

