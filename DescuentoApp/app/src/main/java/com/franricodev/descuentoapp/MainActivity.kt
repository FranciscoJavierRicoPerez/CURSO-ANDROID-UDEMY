package com.franricodev.descuentoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.franricodev.descuentoapp.ui.theme.DescuentoAppTheme
import com.franricodev.descuentoapp.viewModels.CalcularViewModel2
import com.franricodev.descuentoapp.viewModels.CalcularViewModel3
import com.franricodev.descuentoapp.views.HomeView
import com.franricodev.descuentoapp.views.HomeView2
import com.franricodev.descuentoapp.views.HomeView3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel : CalcularViewModel3 by viewModels()
        setContent {
            DescuentoAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeView3(viewModel)
                }
            }
        }
    }
}
