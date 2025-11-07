@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DaftarPeserta (
    modifier: Modifier = Modifier,
    onBackToHome: () -> Unit,
    onGoToForm: () -> Unit
) {
    val pesertaData = listOf(
        "NAMA LENGKAP" to "Aswin Lutfian Prasetyo",
        "JENIS KELAMIN" to "Laki-Laki",
        "STATUS PERKAWINAN" to "Belum Menikah",
        "ALAMAT" to "Yogyakarta"
    )

    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFF3E5F5), // Latar ungu muda
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "List Daftar Peserta",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF9C27B0) // Ungu tua header
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .padding(20.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        )
    }
}