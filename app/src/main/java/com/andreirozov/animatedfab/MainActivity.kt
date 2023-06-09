package com.andreirozov.animatedfab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.andreirozov.animatedfab.ui.ContentScreen
import com.andreirozov.animatedfab.ui.theme.AnimatedFABTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AnimatedFABApp()
        }
    }
}

@Composable
private fun AnimatedFABApp() {
    AnimatedFABTheme {
        ContentScreen()
    }
}