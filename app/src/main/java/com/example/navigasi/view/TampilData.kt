package com.example.navigasi.view

import androidx.compose.runtime.Composable
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.navigasi.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimenalMaterial3Api::class)
@Composable
fun TampilData (
    onBackBtnClick:()-> Unit
) {
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(R.string.alamat), "Yogyakarta")
    )
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.tampil), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.teal_700))
            )
        }
    )
}