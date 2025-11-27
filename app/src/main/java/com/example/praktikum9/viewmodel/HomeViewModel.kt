package com.example.praktikum9.viewmodel

import com.example.praktikum9.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel (private val repositoriSiswa: RepositoriSiswa): viewModel(){

    companion object {
        private const val TIMEOUT_MILLIS = 5_00L
    }

    val homeUiState: StateFlow<HomeUiState> = repositoriSiswa.getAllSiswaStream()
            .filterNotNull()

        .map {HomeUiState(listSiswa = it.toList()) }
        .stateIn(scope - viewModelScope,
            started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
            initialValue = HomeUiState())
}