package com.example.view_model

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.view_model.punto_1.ContadorScreen
import com.example.view_model.punto_2.LoginScreen
import com.example.view_model.punto_3.PhoneScreen
import com.example.view_model.punto_4.ThemeToggleScreen
import com.example.view_model.punto_5.PasswordStrengthScreen
import com.example.view_model.punto_6.RegisterScreen
import com.example.view_model.punto_8.TextLimitScreen
import com.example.view_model.ui.theme.View_ModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            View_ModelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    View_ModelTheme {
        //1. ContadorScreen()
        //2. LoginScreen()
        //3. PhoneScreen()
        //4. ThemeToggleScreen()
        //5. PasswordStrengthScreen()
        //6. RegisterScreen()
        //7. TaskListScreen()
        //8. TextLimitScreen()
    }
}

