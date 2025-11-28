package com.example.pam_activity7_roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pam_activity7_roomdatabase.repositori.AplikasiSiswa
import com.example.pam_activity7_roomdatabase.viewmodel.EntryViewModel
import com.example.pam_activity7_roomdatabase.viewmodel.HomeViewModel

object PenyediaViewModel {
    val factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek Application dan mengembalikan sebuah instance dari AplikasiSiswa
 */

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)