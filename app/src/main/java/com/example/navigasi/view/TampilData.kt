package com.example.navigasi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import com.example.navigasi.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
        }) { isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column (modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.SpacedBy(dimensionResource(id = R.dimen.padding_small))) {
                items.forEach { item ->
                    Column {
                        Text(item.first.uppercase(),
                            fontSize = 16.sp)
                        Text(text = item.second,
                            fontWeight = FontWeight.Bold,
                            FontFamily = FontFamily.Cursive,
                            fontSize = 22.sp)
                    }
            }
        }

    }
    )
}