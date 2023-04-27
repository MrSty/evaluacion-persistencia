package com.example.miproyectofinal.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.miproyectofinal.entities.Membresia
import com.example.miproyectofinal.entities.Usuario

@Dao
interface DaoMembresia {
    @Query("SELECT * FROM membresias")
    suspend fun obtenerMembresias(): MutableList<Membresia>

    @Insert
    suspend fun agregarMembresia(membresia: Membresia)

    @Update
    suspend fun updateMembresias(vararg membresia: Membresia)

    @Query("DELETE FROM membresias WHERE idMembresia=:idMembresia")
    suspend fun eliminarMembresia(idMembresia:Int)
}