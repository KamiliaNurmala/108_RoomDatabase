package com.example.praktikum9.room

import androidx.room.PrimaryKey


@Entitiy(tableName = "tblSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String
)