package com.example.navigasi.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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
        )
    }
}