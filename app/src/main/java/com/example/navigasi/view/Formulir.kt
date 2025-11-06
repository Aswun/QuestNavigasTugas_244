@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

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


    }
}