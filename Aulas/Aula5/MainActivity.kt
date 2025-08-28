package com.seunome.empresa.projetoosorio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seunome.empresa.projetoosorio.ui.theme.ProjetoOsorioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoOsorioTheme {
                primeiraTela()
            }
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun primeiraTela(){

    Scaffold {

        Column {

            Row {
                bloco("Titulo", "Descricao", Color.Green)
                bloco("Titulo", "Descricao", Color.Blue)
            }

            Row {
                bloco("Titulo", "Descricao", Color.Yellow)
                bloco("Titulo", "Descricao", Color.Red)
            }

        }

    }

}

@Composable
fun bloco(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier.width(200.dp)
            .height(200.dp)
            .padding(5.dp),
        color = color,
        shadowElevation = 6.dp,
        tonalElevation = 6.dp,
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(
            text = titulo,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Green
        )
        Text(
            text = desc,
            style = MaterialTheme.typography.titleLarge,
        )
    }
}