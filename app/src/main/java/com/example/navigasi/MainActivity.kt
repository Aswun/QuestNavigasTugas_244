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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigasiTheme {
                var currentPage by remember { mutableStateOf("beranda") }

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    when (currentPage) {
                        "beranda" -> {
                            Beranda(
                                onSubmitClick = {
                                    currentPage = "daftar_peserta"
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        "daftar_peserta" -> {
                            DaftarPeserta(
                                onBackToHome = {
                                    currentPage = "beranda"
                                },
                                onGoToForm = {
                                    currentPage = "form"
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        "form" -> {
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
