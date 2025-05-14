package com.example.project_1.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.R

@Composable
fun SVG() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "SVG FORMAT",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color(0xFFFBAA2C),
            modifier = Modifier.padding(20.dp)
        )

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 17.dp)
                .clip(RoundedCornerShape(100.dp))
        )

        Text(
            text = "What's SVG?",
            fontWeight = FontWeight.Bold,
            fontSize = 23.sp,
            color = Color(0xFFFBAA2C)
        )

        Text(
            text = "The SVG file format is a popular tool for displaying two-dimensional graphics, charts, and illustrations on websites.",
            modifier = Modifier.padding(32.dp),
            color = Color.Gray,

        )

        Button(
            onClick = { /* Acción */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFBAA2C)),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = "Ver más", color = Color.Black, fontWeight = FontWeight.Bold)
        }
    }
}
