package com.example.navigasi.view

import android.content.pm.ShortcutInfo
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import com.example.navigasi.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.fillMaxWidth
import com.example.navigasi.DataDiri


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData (
    dataDiri: DataDiri,
    onBackBtnClick:()-> Unit
) {
    // Membangun daftar item dari objek DataDiri yang diterima
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), dataDiri.nama),
        Pair(stringResource(R.string.jenis_kelamin), dataDiri.jenisKelamin),
        Pair(stringResource(R.string.alamat), dataDiri.alamat)
    )
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.tampil), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_700)) // Mengubah warna header
            )
        }) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_medium))
                    .weight(1f), // Agar konten mengisi ruang sisa
                verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))
            ) {
                items.forEach { item ->
                    Column(modifier = Modifier.padding(vertical = 4.dp)) {
                        Text(
                            item.first.uppercase(),
                            fontSize = 14.sp, 
                            color = Color.DarkGray
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Black,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 24.sp
                        )
                    }
                    HorizontalDivider(thickness = 2.dp, color = Color(0xFFD1C4E9)) // Mengubah warna dan ketebalan divider
                }
            }

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = dimensionResource(id = R.dimen.padding_medium))
                    .padding(bottom = dimensionResource(id = R.dimen.padding_medium)),
                onClick = onBackBtnClick
            ) {
                Text(text = stringResource(R.string.back))
            }
        }
    }
}