package com.be.composeapplication

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.be.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(Modifier.fillMaxWidth()) {
                MyCompose("first app on compose")

            }
        }
    }
}

@Composable
fun MyCompose(msg: String) {
    showPreview(msg)
}

@Composable
fun showPreview(msg: String) {
    val context = LocalContext.current
    var i: Int = 0
    Row(Modifier.background(Color.Red)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "this is first image insert in compose",
            Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, Color.Blue, CircleShape)
                .clickable {
                    Log.e("Image", "Hurra" + i++)
                    Toast
                        .makeText(
                            context, "Hurra", Toast.LENGTH_LONG
                        )
                        .show()
                }
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column() {
            Text(text = "$msg", color = MaterialTheme.colors.onPrimary)
            Text(text = "develop by ahssan")
        }
    }


}