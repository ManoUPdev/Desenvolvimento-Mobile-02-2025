import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppLembretesVisual()
        }
    }
}
@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppLembretesVisual() {
    var lembreteInput by remember { mutableStateOf("") }
    var lembretes by remember { mutableStateOf(listOf<String>()) }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        // Card com nome e tipo
        Card(
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E0E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Oswaldo", style = MaterialTheme.typography.titleMedium)
                Text("Tipo Programador", style = MaterialTheme.typography.bodyMedium)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Campo de texto + botão
        Row(modifier = Modifier.fillMaxWidth()) {
            OutlinedTextField(
                value = lembreteInput,
                onValueChange = { lembreteInput = it },
                label = { Text("Lembretes") },
                modifier = Modifier.weight(1f),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(onDone = {
                    if (lembreteInput.isNotBlank()) {
                        lembretes = lembretes + lembreteInput
                        lembreteInput = ""
                    }
                })
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                if (lembreteInput.isNotBlank()) {
                    lembretes = lembretes + lembreteInput
                    lembreteInput = ""
                }
            }) {
                Text("Adicionar")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Listinha de Lembretes:", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(lembretes) { item ->
                Card(
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E0E0)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(item)
                    }
                }
            }
        }
    }
}
