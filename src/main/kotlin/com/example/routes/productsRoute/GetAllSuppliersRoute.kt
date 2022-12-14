package com.example.routes.productsRoute

import com.example.data.repositories.productRepository.ProductRepositoryImpl
import com.example.domin.endPoints.ProductsEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllSupplierRoute(){
    val productRepository by lazy { ProductRepositoryImpl() }

    post(ProductsEndPoint.AllSupplierEndPoint.path) {
        val suppliers = productRepository.getAllSupplier()
        if (suppliers.isEmpty())
            call.notFoundResponse()
        else call.respond(suppliers)
    }
}