package com.example.navigasi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Beranda (
    modifier: Modifier = Modifier,
    onSubmitClick: () -> Unit
) {
    // Mengubah containerColor menjadi ungu muda untuk nuansa UI yang berbeda
    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFE1BEE7)
    ) {
        paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Selamat Datang",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6A1B9A), // Ungu tua
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 30.dp)
            )
        }
    }
}