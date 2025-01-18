package com.example.compose5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.compose5.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MostrarChiste("Va un señor caminando por la calle y se tropieza... ¡Qué chiste más largo!")
        }
    }
}

@Composable
fun MostrarChiste(chiste: String) {
    val scroll = rememberScrollState(0)
    Column {
        Text(
            text = chiste, // Usar la variable `chiste` correctamente
            fontFamily = FontFamily(Font(R.font.rally)),
            fontSize = 20.sp, // Cambié el tamaño para que sea más legible
            modifier = Modifier.horizontalScroll(scroll) // Agregando desplazamiento horizontal
        )
    }
}
