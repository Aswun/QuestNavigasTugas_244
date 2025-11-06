@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FormIsian (
    JenisK:List<String> = listOf("laki-laki","perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold (modifier=Modifier, {
            TopAppBar(
                title = { Text(stringResource(R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.
                        TopAppBarColors(colorResource(id = R.color.teal_700))
            ) }
    ) { isiRuang ->
        Column (modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp))
                    .width(250.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {},
            )

    }
}