@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigasi.R
import com.example.navigasi.STATIC_DATA

@Composable
fun DaftarPeserta(
    modifier: Modifier = Modifier,
    onBackToHome: () -> Unit,
    onGoToForm: () -> Unit
) {
    val dataStatis = STATIC_DATA

    val pesertaData = listOf(
        "NAMA LENGKAP" to dataStatis.nama,
        "JENIS KELAMIN" to dataStatis.jenisKelamin,
        "STATUS PERKAWINAN" to "Belum Menikah",
        "ALAMAT" to dataStatis.alamat
    )

    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFF3E5F5),
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
                    containerColor = Color(0xFF9C27B0)
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
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                pesertaData.forEach { (label, value) ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 6.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        shape = MaterialTheme.shapes.medium,
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(
                                text = label,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )
                            Text(
                                text = value,
                                fontSize = 16.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = onBackToHome,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF9C27B0),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(horizontal = 20.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.back),
                        fontSize = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = onGoToForm,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFBA68C8),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(horizontal = 20.dp)
                ) {
                    Text(
                        text = "Isi Formulir Pendaftaran",
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}