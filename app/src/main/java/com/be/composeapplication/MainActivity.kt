package com.be.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

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

data class Message(val id: Int, val title: String, val description: String)

@Composable
fun MyCompose(msg: String) {
    var list = ArrayList<Message>()
    list.add(Message(1, "ahssan", "goodboy"))
    list.add(Message(2, "ahssan", "goodboy"))
    list.add(Message(1, "ahssan", "goodboy"))
    list.add(Message(2, "ahssan", "goodboy"))
    list.add(Message(1, "ahssan", "goodboy"))

    showPreview(list)
}

@Composable
fun showPreview(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            showCaht(message)
        }


    }


}

@Composable
fun showCaht(message: Message) {
    val context = LocalContext.current
    var align:TextAlign
    if (message.id == 1) {
        align = TextAlign.Right
    } else {
        align = TextAlign.Left

    }
    Text(text = message.title,modifier = Modifier.fillMaxWidth().padding(10.dp), textAlign = align)

}
