package com.example.praktikum9.room

import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SiswaDao {
    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}
