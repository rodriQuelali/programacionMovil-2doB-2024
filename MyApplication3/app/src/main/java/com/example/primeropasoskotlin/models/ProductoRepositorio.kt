package com.example.primeropasoskotlin.models

import android.content.ContentValues
import android.content.Context
import com.example.primeropasoskotlin.db.AdminSQLiteOpenHelper

class ProductoRepositorio(context:Context) {

    private val adminSQLiteOpenHelper: AdminSQLiteOpenHelper = AdminSQLiteOpenHelper(context, "administracion", null, 1)

    fun insertProduc(producto: Productos): Int {
        return try {
            val db = adminSQLiteOpenHelper.writableDatabase
            val registro = ContentValues().apply {
                put("id_producto", producto.getIdProducto())
                put("id_categoria", producto.getIdCategoria())
                put("id_proveedor", producto.getIdProveedor())
                put("nombre", producto.getNombre())
                put("precio", producto.getPrecio())
            }
            db.insert("producto", null, registro)
            db.close()
            1
        } catch (e: Exception) {
            0
        }
    }

    // Eliminar un producto (aún no implementado completamente)
    fun deletePro(producto: Productos): Int {

        return 1
    }

    // Actualizar un producto (aún no implementado completamente)
    fun updatePro(producto: Productos): Int {

        return 1
    }
}