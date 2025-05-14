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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.R


@Composable
fun Lego() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "LEGO WORLD",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            color = Color(0xFFDA1212),
            modifier = Modifier.padding(20.dp)
        )

        Image(
            painter = painterResource(R.drawable.lego),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 17.dp)


        )

        Text(
            text = "What's LEGO?",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color(0xFFDA1212)
        )

        Text(
            text = "LEGO is a line of plastic construction toys that are manufactured by The Lego Group, based in Billund, Denmark. It’s iconic, creative, and inspires all ages.",
            modifier = Modifier.padding(horizontal = 32.dp),
            color = Color.DarkGray,
            fontSize = 16.sp
        )
    }
}
