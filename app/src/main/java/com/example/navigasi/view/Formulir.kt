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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.navigasi.R
import com.example.navigasi.DataDiri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun FormIsian (
    modifier: Modifier = Modifier,
    jenisK:List<String> = listOf("laki-laki","perempuan"),
    onSubmitBtnClick : (DataDiri) -> Unit
) {
    var namaInput by remember { mutableStateOf("") }
    var alamatInput by remember { mutableStateOf("") }
    var jenisKelaminSelected by remember { mutableStateOf(jenisK.first()) }

    Scaffold (modifier=Modifier, {
            TopAppBar(
                title = { Text(stringResource(R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.
                        topAppBarColors(colorResource(id = R.color.teal_700))
            ) }
    ) { isiRuang ->
        Column (modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally ) {
            OutlinedTextField(
                value = namaInput,
                onValueChange = { namaInput = it },
                singleLine = true,
                label = { Text(text = "Nama Lengkap") },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(0.9f)
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "JENIS KELAMIN:",
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 10.dp),
                color = Color.Gray
            )
            // Jenis Kelamin
            jenisK.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(0.9f)
                ) {
                    RadioButton(
                        selected = jenisKelaminSelected == item,
                        onClick = { jenisKelaminSelected = item }
                    )
                    Text(text = item)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Alamat
            OutlinedTextField(
                value = alamatInput,
                onValueChange = { alamatInput = it },
                singleLine = false, // Diubah menjadi multi-line untuk implementasi berbeda
                label = { Text(text = "Alamat") },
                modifier = Modifier.fillMaxWidth(0.9f)
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Tombol Submit
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    val data = DataDiri(
                        nama = namaInput,
                        jenisKelamin = jenisKelaminSelected,
                        alamat = alamatInput
                    )
                    onSubmitBtnClick(data)
                },
                enabled = namaInput.isNotBlank() && alamatInput.isNotBlank() // Logika validasi berbeda
            ) {
                Text(text = stringResource(id = R.string.submit))
            }
        }
    }
}