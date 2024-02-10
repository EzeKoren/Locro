package com.ezekoren.locro

import android.media.tv.TvContract.Channels.Logo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ezekoren.locro.ui.theme.LocroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrawLayout()
        }
    }
}

@Composable
fun DrawLayout() {
    Column {
        Logo()
        MyText("Putos")
        MyText("Putas")
        MyText("Putes")
    }
}

@Composable
fun Logo() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Logo Locro"
    )
}

@Composable
fun MyText(text: String) {
    Text("Hola $text")
}

@Preview
@Composable
fun PreviewLayout()  {
    DrawLayout()
}

