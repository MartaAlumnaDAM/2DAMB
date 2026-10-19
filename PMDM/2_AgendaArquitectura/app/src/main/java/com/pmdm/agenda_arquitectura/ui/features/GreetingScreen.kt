package com.pmdm.agenda_arquitectura.ui.features

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.agenda_arquitectura.ui.theme.agenda_arquitecturaTheme

@Composable
fun GreetingScreen(
    datos : String = " ",
    numero: Int,
    onPulsar: () -> Unit,
    onValueChange : (String) -> Unit
) {
    Column() {
        Text(
            text = numero.toString(),
        )

        Button(onClick = onPulsar){
            Text(text = "Pulsar")
        }

        TextField(
            value = datos,
            placeholder = {Text(text = "Introduce datos")},
            onValueChange = onValueChange
        )
    }}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    agenda_arquitecturaTheme {
        var numero by remember{ mutableStateOf(6) }
        var datos by remember{mutableStateOf(value = "")}
        GreetingScreen(
            datos = datos,
            numero = numero,
            onPulsar = {numero++},
            onValueChange = { datos = it }
        )
    }
}