package com.example.miproyectofinal.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.miproyectofinal.entities.Usuario

@Dao
interface DaoUsuario {
    @Query("SELECT * FROM usuarios")
    suspend fun obtenerUsuarios(): MutableList<Usuario>

    @Insert
    suspend fun agregarUsuario(usuario: Usuario)

    @Update
    suspend fun updateUsers(vararg user:Usuario)

    @Query("DELETE FROM usuarios WHERE cedula=:cedula")
    suspend fun eliminarUsuario(cedula:String)
}