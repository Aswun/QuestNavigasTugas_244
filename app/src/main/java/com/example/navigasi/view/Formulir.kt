@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@Composable
fun FormIsian (
    JenisK:List<String> = listOf("laki-laki","perempuan"),
    OnSubmitBtnClick : () -> Unit
)