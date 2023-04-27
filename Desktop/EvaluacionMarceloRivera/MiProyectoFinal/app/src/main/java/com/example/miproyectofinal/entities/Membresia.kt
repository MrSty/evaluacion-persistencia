package com.example.miproyectofinal.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "membresias")
data class Membresia(
    @PrimaryKey var idMembresia: Int,
    @ColumnInfo(name = "nombreMembresia") var nombreMembresia: String,
    @ColumnInfo(name = "duracion") var duracion:Int

)
