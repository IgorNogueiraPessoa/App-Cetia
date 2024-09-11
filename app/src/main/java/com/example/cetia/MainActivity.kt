package com.example.cetia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cetia.ui.theme.CetiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CetiaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF0D0014)
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    val labelColor = Color(0xFF870DD9)
    var sliderValueCompetencia by remember { mutableStateOf(0f) }
    var sliderValueEsforco by remember { mutableFloatStateOf(0f) }
    var sliderValueTrabalho by remember { mutableFloatStateOf(0f) }
    var sliderValueInteresse by remember { mutableFloatStateOf(0f) }
    var sliderValueAtitude by remember { mutableFloatStateOf(0f) }
    var resultado by remember { mutableStateOf(0f) }
    var showResultado by remember { mutableStateOf(false) }
    val image = painterResource(R.drawable.cetia)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Cálculo do CETIA", color = labelColor, fontWeight = FontWeight.Bold)
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
            ) {
                Text(text = "Competência", color = labelColor, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Slider(
                    value = sliderValueCompetencia,
                    onValueChange = { sliderValueCompetencia = it },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = labelColor,
                        inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                    ),
                    valueRange = 0f..4f
                )
                Text(text = sliderValueCompetencia.toInt().toString(), color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
            ) {
                Text(text = "Esforço", color = labelColor, fontWeight = FontWeight.Bold)
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Slider(
                    value = sliderValueEsforco,
                    onValueChange = { sliderValueEsforco = it },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = labelColor,
                        inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                    ),
                    valueRange = 0f..4f
                )
                Text(text = sliderValueEsforco.toInt().toString(), color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
            ) {
                Text(text = "Trabalho", color = labelColor, fontWeight = FontWeight.Bold)
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Slider(
                    value = sliderValueTrabalho,
                    onValueChange = { sliderValueTrabalho = it },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = labelColor,
                        inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                    ),
                    valueRange = 0f..4f
                )
                Text(text = sliderValueTrabalho.toInt().toString(), color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
            ) {
                Text(text = "Interesse", color = labelColor, fontWeight = FontWeight.Bold)
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Slider(
                    value = sliderValueInteresse,
                    onValueChange = { sliderValueInteresse = it },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = labelColor,
                        inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                    ),
                    valueRange = 0f..4f
                )
                Text(text = sliderValueInteresse.toInt().toString(), color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
            ) {
                Text(text = "Atitude", color = labelColor, fontWeight = FontWeight.Bold)
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Slider(
                    value = sliderValueAtitude,
                    onValueChange = { sliderValueAtitude = it },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = labelColor,
                        inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                    ),
                    valueRange = 0f..4f
                )
                Text(text = sliderValueAtitude.toInt().toString(), color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        if (showResultado) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = "${sliderValueCompetencia.toInt()} + " +
                        "${sliderValueEsforco.toInt()} + " +
                        "${sliderValueTrabalho.toInt()} + " +
                        "${sliderValueInteresse.toInt()} + " +
                        "${sliderValueAtitude.toInt()} / 2 = " +
                        "%.1f".format(resultado) ,
                color = Color.White
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Seu Cetia é %.1f".format(resultado),color = Color.White)
        }
            }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {
                    resultado = (sliderValueCompetencia.toInt() + sliderValueEsforco.toInt() + sliderValueTrabalho.toInt() + sliderValueInteresse.toInt() + sliderValueAtitude.toInt()) / 2f
                    showResultado = true
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF870DD9),
                    contentColor = Color.White
                )

            ) {

                Text(text = "Calcular")
            }
        }
        }
    }

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    CetiaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF0D0014)
        ) {
            App()
        }
    }
}