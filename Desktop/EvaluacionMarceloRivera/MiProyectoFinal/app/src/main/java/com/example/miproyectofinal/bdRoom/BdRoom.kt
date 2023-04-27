package com.example.miproyectofinal.bdRoom

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.DaoMembresia
import com.example.miproyectofinal.dao.DaoUsuario
import com.example.miproyectofinal.entities.Membresia
import com.example.miproyectofinal.entities.Usuario

@Database(
    entities = [Usuario::class, Membresia::class],
    version = 1
)

abstract class BdRoom :RoomDatabase() {
    abstract fun daoUsuario():DaoUsuario
    
    abstract fun daoMembresia():DaoMembresia
}