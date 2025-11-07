@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.navigasi.R
import com.example.navigasi.DataDiri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.navigasi.STATIC_DATA

@Composable
fun FormIsian(
    modifier: Modifier = Modifier,
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    onSubmitBtnClick: () -> Unit
) {
    val namaStatic = STATIC_DATA.nama
    val jkStatic = STATIC_DATA.jenisKelamin
    val alamatStatic = STATIC_DATA.alamat

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.home),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = namaStatic,
                onValueChange = { },
                singleLine = true,
                label = { Text(text = "Aswin Lutfian Prasetyo") },
                readOnly = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(0.9f)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "JENIS KELAMIN: Laki-Laki",
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 10.dp),
                color = Color.Gray
            )
            jenisK.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(0.9f)
                ) {
                    RadioButton(
                        selected = jkStatic == item,
                        onClick = { }
                    )
                    Text(text = item)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = alamatStatic,
                onValueChange = { },
                singleLine = false,
                label = { Text(text = "Jalan Rajawali, Yogyakarta") },
                readOnly = true,
                modifier = Modifier.fillMaxWidth(0.9f)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onSubmitBtnClick
            ) {
                Text(text = stringResource(id = R.string.submit))
            }
        }
    }
}