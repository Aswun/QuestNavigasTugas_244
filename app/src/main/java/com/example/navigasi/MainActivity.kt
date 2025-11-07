package com.example.navigasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigasi.ui.theme.NavigasiTheme
import com.example.navigasi.view.Beranda
import com.example.navigasi.view.DaftarPeserta

enum class MainScreen {
    BERANDA,
    DAFTAR_PESERTA,
    FORM_NAV_GRAPH
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigasiTheme {
                var currentScreen by remember { mutableStateOf(MainScreen.BERANDA) }

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    when (currentScreen) {
                        MainScreen.BERANDA -> {
                            Beranda(
                                onSubmitClick = {
                                    currentScreen = MainScreen.DAFTAR_PESERTA
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        MainScreen.DAFTAR_PESERTA -> {
                            DaftarPeserta(
                                onBackToHome = {
                                    currentScreen = MainScreen.BERANDA
                                },
                                onGoToForm = {
                                    currentScreen = MainScreen.FORM_NAV_GRAPH
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        MainScreen.FORM_NAV_GRAPH -> {
                            DataApp(
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                    }
                }
            }
        }
    }
}
