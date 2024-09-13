package com.example.primeropasoskotlin.models

class ProductoDao(private val productoRepositorio: ProductoRepositorio) {

    fun insertarProducto(productos: Productos):Int{
        return productoRepositorio.insertProduc(productos)
    }
}