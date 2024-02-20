package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(color = Color(0xFFCC2121))
        ) {
            Image(
                painter = painterResource(id = R.drawable.bmi),
                contentDescription =""
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontSize = 25.sp
            )
        }

        Card(
            colors = CardDefaults.cardColors(Color(0xFFE0DFDF)),
            modifier = Modifier
                .fillMaxWidth()
                .height(480.dp)
                .padding(40.dp)
                .offset(x = 0.dp, y = -80.dp),
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Seus Dados",
                    fontSize = 25.sp,
                    color = Color(0xFFD61212),
                    fontWeight = FontWeight.ExtraBold,
                )
                Text(
                    text = "Seu Peso",
                    color = Color(0xFFA51414),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .offset(x = -100.dp, y = 35.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .height(50.dp)
                        .offset(x = 0.dp, y = 45.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFAF0B0B),
                        unfocusedContainerColor = Color(0xffffffff)
                    ),
                    placeholder = {
                        Text(
                            text = "Digite o seu peso aqui",
                            fontSize = 15.sp,
                        )}
                )

                Text(
                    text = "Sua Altura",
                    color = Color(0xFFA51414),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .offset(x = -100.dp, y = 75.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .height(50.dp)
                        .offset(x = 0.dp, y = 85.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFAF0B0B),
                        unfocusedContainerColor = Color(0xffffffff)
                    ),
                    placeholder = {
                        Text(
                            text = "Digite a sua altura aqui",
                            fontSize = 15.sp,
                        )}
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(300.dp)
                        .height(50.dp)
                        .offset(x = 0.dp, y = 125.dp),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFDA0F0F)
                    )
                ) {
                    Text(
                        text = "CALCULAR" )

                }
            }
        }

        Box(
            modifier = Modifier
                .width(320.dp)
                .height(120.dp)
                .offset(x = 40.dp, y = -105.dp)
                .background(color = Color(0xFF2D6D1F))


        ){
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(25.dp, 25.dp)
                ) {
                    Text(
                        text = "Resultado",
                        color = Color.White,
                        fontSize = 15.sp
                    )
                    Text(
                        text = "Peso Ideal!",
                        color = Color.White,
                        fontSize = 25.sp
                    )
            }
                Text(
                    text = "21.3",
                    color = Color.White,
                    fontSize = 40.sp,
                    modifier = Modifier.offset(x = 30.dp, y = 30.dp)
                )

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}