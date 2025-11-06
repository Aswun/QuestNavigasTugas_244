package com.example.navigasi.view

import androidx.compose.runtime.Composable

@OptIn(ExperimenalMaterial3Api::class)
@Composable
fun TampilData (
    onBackBtnClick:()-> Unit
) {
    val items = listOf (
        Pair(stringResource(R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(R.string.alamat), "Yogyakarta")
    )
}