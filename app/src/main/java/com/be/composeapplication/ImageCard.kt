package com.be.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.be.composeapplication.ui.theme.ComposeApplicationTheme

class ImageCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            imageCardDesign()
        }
    }

    @Composable
    private fun imageCardDesign() {
        Column(modifier = Modifier.fillMaxWidth(.5f)) {
            Card(
                shape = RoundedCornerShape(6),
                elevation = 5.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.compose),
                        contentDescription = "nice image of compose"
                    )
                }
                Box(
                    Modifier.background( Brush.verticalGradient(
                        listOf(Color.Black,Color.Black),
                        startY = 200f

                    ))
                )
                Box(
                    modifier = Modifier
                        .height(230.dp)
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(text = "Hurrah compose", style = TextStyle(Color.White, fontSize = 16.sp))
                }
            }

        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeApplicationTheme {
        Greeting2("Android")
    }
}