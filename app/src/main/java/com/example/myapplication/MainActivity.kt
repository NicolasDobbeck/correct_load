package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoadScreen()
                }
            }
        }
    }
}

@Composable
fun LoadScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(id = R.drawable.loadpic),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Row() {
            Text(
                text =  stringResource(id = R.string.text_logo),
                fontSize = 80.sp,
                style = MaterialTheme.typography.h2.copy(
                    fontFamily = FontFamily(Font(R.font.mansalva_regular)),
                    color = Color(android.graphics.Color.parseColor("#E0B441"))
                )
            )
            Text(
                text =  stringResource(id = R.string.text_logo2),
                fontSize = 80.sp,
                style = MaterialTheme.typography.h2.copy(
                    fontFamily = FontFamily(Font(R.font.mansalva_regular)),
                    color = Color(android.graphics.Color.parseColor("#FFFFFF"))
                )
            )
        }
        Text(
            modifier = Modifier.offset(y = 50.dp),
            text = stringResource(id = R.string.subtitle),
            fontSize = 16.sp,
            style =  MaterialTheme.typography.h4.copy(
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                color = Color(android.graphics.Color.parseColor("#FFFFFF"))
            )
        )
        CircularProgressIndicator(
            modifier = Modifier.offset(y = 100.dp),
            color = Color(224, 180, 65)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        LoadScreen()
    }
}