package com.example.praktikum9.viewmodel

import com.example.praktikum9.repositori.RepositoriSiswa

class HomeViewModel (private val repositoriSiswa: RepositoriSiswa): viewModel(){

    companion object {
        private const val TIMEOUT_MILLIS = 5_00L
    }

}