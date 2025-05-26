package com.example.project_1.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
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
fun BITCOIN(onGoToLogin: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Bitcoin",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFF7931A)
        )

        Image(
            painter = painterResource(R.drawable.bitcoin),
            contentDescription = "Bitcoin Logo",
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(100.dp))
        )

        Text(
            text = "Bitcoin es una moneda digital descentralizada...",
            modifier = Modifier.padding(16.dp),
            color = Color.Gray
        )

        Button(
            onClick = onGoToLogin,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF7931A)),
            shape = RoundedCornerShape(50)
        ) {
            Text(text = "Ir a Login", color = Color.Black)
        }
    }
}
