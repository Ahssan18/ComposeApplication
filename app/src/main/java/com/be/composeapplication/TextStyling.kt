package com.be.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class TextStyling : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting3("Android")
        }
    }

    @Composable
    fun Greeting3(name: String) {
        var fonts = FontFamily(
            Font(R.font.hand_written)
        )
        Box() {
            Text(
                text = buildAnnotatedString {
                                            withStyle(
                                                style = SpanStyle(Color.Green,
                                                fontWeight = FontWeight.Bold,
                                                )
                                            ){
                                                append("W")
                                            }
                    append("elcome")
                },
                style = TextStyle(
                    Color.Red,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                ),
                fontFamily = fonts

            )

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview3() {
        Greeting3("Android")
    }
}
