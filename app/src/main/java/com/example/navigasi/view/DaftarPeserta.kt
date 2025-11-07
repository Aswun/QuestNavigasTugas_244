@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DaftarPeserta (
    modifier: Modifier = Modifier,
    onBackToHome: () -> Unit,
    onGoToForm: () -> Unit
) {
    val pesertaData = listOf(
        "NAMA LENGKAP" to "As Wun",
        "JENIS KELAMIN" to "Laki-Laki",
        "STATUS PERKAWINAN" to "Belum Menikah",
        "ALAMAT" to "Yogyakarta"
    )

}