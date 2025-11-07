package com.example.navigasi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigasi.R

@Composable
fun Beranda (
    modifier: Modifier = Modifier,
    onSubmitClick: () -> Unit
) {
    // Mengubah containerColor menjadi ungu muda untuk nuansa UI yang berbeda
    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFE1BEE7)
    ) {
        paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Selamat Datang",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6A1B9A), // Ungu tua
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(200.dp)
                    .padding(bottom = 20.dp)
            )
            Text(
                text = "MOBILE APP",
                fontSize = 14.sp,
                color = Color(0xFF6A1B9A),
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "2025",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6A1B9A),
                modifier = Modifier.padding(bottom = 30.dp)
            )
            Text(
                text = "Aswin Lutfian Prasetyo",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF6A1B9A),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "20230140244",
                fontSize = 16.sp,
                color = Color(0xFF6A1B9A),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 30.dp)
            )

            Button(
                onClick = onSubmitClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6A1B9A),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 40.dp)
            ) {
                Text(text = "Lihat Daftar Peserta", fontSize = 16.sp)
        }
    }
}