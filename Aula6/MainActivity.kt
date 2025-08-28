package com.seunome.empresa.projetoosorio

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
                TelaFormulario1()
            }
        }
    }
}


@Preview
@Composable
fun TelaFormulario1(){

    var textinho by remember {
        mutableStateOf("email")
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {

        Column { 
            
            Text("Cadastro")

            TextField(
                value = textinho,
                onValueChange = {
                    textinho = it
                }
            )

        }

    }
}



@Preview // (showBackground = true)
@Composable
fun TelaBotao(){

    // var contador = 0
    var contador by remember {
        mutableStateOf(0)
    }


    Surface(
        modifier = Modifier
            .width(200.dp)
            .height(100.dp)
    ) {

        Column {
            Text("Contador: $contador")
            Button(onClick = {
                contador += 1
                Log.d("OI", "Apertou o Botao - $contador")
            }){
                Text("Aperte o Botao!")
            }
        }

    }

}
