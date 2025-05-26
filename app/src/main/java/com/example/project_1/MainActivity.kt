package com.example.project_1

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import com.example.project_1.view.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.BITCOIN
import com.example.project_1.view.SVG
import com.example.project_1.view.LEGO
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                Horizontal()
            }
        }
    }
}



@Composable
fun Horizontal() {
    var showLogin by remember { mutableStateOf(false) }
    var showWelcome by remember { mutableStateOf(false) }
    var username by remember { mutableStateOf("") }

    when {
        showWelcome -> WelcomeView(username)
        showLogin -> LoginView(
            onLoginSuccess = {
                username = it
                showLogin = false
                showWelcome = true
            }
        )
        else -> {
            val pagerState = rememberPagerState(initialPage = 0, pageCount = { 3 })

            // Auto avance del carrusel
            LaunchedEffect(Unit) {
                while (true) {
                    delay(3000L)
                    val nextPage = (pagerState.currentPage + 1) % 3
                    pagerState.animateScrollToPage(nextPage)
                }
            }

            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) { page ->
                when (page) {
                    0 -> LEGO()
                    1 -> SVG()
                    2 -> BITCOIN(onGoToLogin = { showLogin = true })
                }
            }
        }
    }
}
