package com.example.practicando_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practicando_01.ui.theme.Practicando_01Theme
import androidx.compose.ui.unit.sp as sp1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
               AlumnoScreen()
                }
            }
        }


@Composable
fun AlumnoScreen() {
    // Crear una caja (Box) con un fondo rojo

    Image(painter = painterResource(id = R.drawable.luffy_g5),
        contentDescription = null,
        modifier = Modifier.fillMaxSize())

    Box(
        modifier = Modifier
            .fillMaxSize() // Ocupa-todo el espacio disponible
            /*.background(Color.Red)*/, // Fondo rojo
        contentAlignment = Alignment.Center // Centra el contenido en el medio
    ) {
        // Texto que muestra "Nombre de alumno"
        Text(
            text = "LUFFY PROXIMO REY PIRATA\uD83D\uDC51",
            color = Color.Yellow, // Texto blanco para que contraste con el fondo
            style = TextStyle(fontSize = 24.sp)// Tamaño de letra

        )
}
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    Practicando_01Theme {
        AlumnoScreen()
    }
}

