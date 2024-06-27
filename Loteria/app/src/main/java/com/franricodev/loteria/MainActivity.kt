package com.franricodev.loteria

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
import com.franricodev.loteria.ui.theme.LoteriaTheme
import com.franricodev.loteria.viewModels.ContadorViewModel
import com.franricodev.loteria.viewModels.LoteriaViewModel
import com.franricodev.loteria.views.Contador
import com.franricodev.loteria.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // val viewModel : ContadorViewModel by viewModels()
        val viewModel : LoteriaViewModel by viewModels()
        setContent {
            LoteriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Contador(viewModel)
                    LoteriaView(viewModel = viewModel)
                }
            }
        }
    }
}
