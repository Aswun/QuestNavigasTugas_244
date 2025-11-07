package com.example.navigasi

// Data class DataDiri tetap diperlukan untuk struktur
data class DataDiri(
    val nama: String = "",
    val jenisKelamin: String = "",
    val alamat: String = ""
)

// Data statis yang akan digunakan secara global
val STATIC_DATA = DataDiri(
    nama = "Aswin Lutfian Prasetyo",
    jenisKelamin = "Laki-laki",
    alamat = "Jalan Rajawali, Yogyakarta"
)