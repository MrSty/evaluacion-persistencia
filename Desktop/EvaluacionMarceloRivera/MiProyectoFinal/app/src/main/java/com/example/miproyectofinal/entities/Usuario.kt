package com.example.miproyectofinal.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuario (
        @PrimaryKey var cedula:String,
        @ColumnInfo(name = "nombre") var nombre:String,
        @ColumnInfo(name = "apellido") var apellido:String,
        @ColumnInfo(name = "edad") var edad:Int,
        @ColumnInfo(name = "peso") var peso:Double,
        @ColumnInfo(name = "tipoMembresia") var tipoMembresia:Int,
        @ColumnInfo(name = "tiempoMem") var tiempoMem:Int,
        @ColumnInfo(name = "tiempoInac") var tiempoInac:Int
        )