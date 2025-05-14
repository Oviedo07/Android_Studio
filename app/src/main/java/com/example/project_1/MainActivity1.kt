package com.example.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1.ui.theme.Project_1Theme

class MainActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}


/*
@Composable
fun First(){
    Row(modifier = Modifier.fillMaxWidth().padding( 0.5.dp ),
        horizontalArrangement = Arrangement.SpaceBetween){
        Texto(text = "CR7", Modifier.width(60.dp))
        Texto(text = "NJR10", Modifier.width(60.dp))
    }
}

@Composable
fun Second(){
    Row(modifier = Modifier.fillMaxWidth().padding( 100.dp ),
        horizontalArrangement = Arrangement.SpaceBetween){
        Texto(text = "EH9", Modifier.width(60.dp))
        Texto(text = "SR93", Modifier.width(60.dp))
    }
}

@Composable
fun Third(){
    Column(modifier = Modifier.fillMaxSize().padding( 100.dp ),
        verticalArrangement = Arrangement.SpaceBetween){
        Texto(text = "", Modifier.width(60.dp))
        Texto(text = "KM9", Modifier.width(60.dp))
    }
    Column(modifier = Modifier.fillMaxSize().padding( 0.1.dp ),
        verticalArrangement = Arrangement.SpaceBetween){
        Texto(text = "", Modifier.width(60.dp))
        Texto(text = "VD4", Modifier.width(60.dp))
    }
}

@Composable
fun Fourth(){
    Column(modifier = Modifier.fillMaxSize().padding( 100.dp ),
        verticalArrangement = Arrangement.SpaceBetween){
        Texto(text = "", Modifier.width(60.dp))
        Texto(text = "KM9", Modifier.width(60.dp))
    }
    Row(modifier = Modifier.fillMaxSize().padding( 30.dp ),
        horizontalArrangement = Arrangement.SpaceBetween){
        Texto(text = "", Modifier.width(60.dp))
        Texto(text = "", Modifier.width(60.dp))
    }
}

@Composable
fun Fifth(){
    Column(modifier = Modifier.fillMaxSize().padding( all =  90.dp ),
        verticalArrangement = Arrangement.Center){
        Texto(text = "AG15", Modifier.fillMaxWidth(). fillMaxHeight(fraction=0.1f))
    }
}



@Composable
fun Sixth() {
    Column(
        modifier = Modifier.fillMaxSize().padding(0.1.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Texto(text = "A88", Modifier.width(60.dp))
    }
}

@Composable
fun Seventh() {
    Column(
        modifier = Modifier.fillMaxSize().padding(100.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Texto(text = "JR10", Modifier.width(60.dp))
    }
}*/
/*
@Composable
fun Body(){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround)
    {
        Image(
            painter = painterResource(R.drawable.card_send_svgrepo_com),
            contentDescription = null
        )
    }
}


@Preview (showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview(){
    Project_1Theme {
       /* First()
        Second()
        Third()
        Fourth()
        Fifth()
        Sixth()
        Seventh()*/
        Body()
    }
}*/