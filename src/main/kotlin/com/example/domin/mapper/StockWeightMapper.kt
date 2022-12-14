package com.example.domin.mapper

import com.example.data.dto.product.StockWeightDto
import com.example.data.entities.productsEntites.StockWeightEntity

fun StockWeightEntity.toStockWeightDto() =
    StockWeightDto(
        stockWeightId = stockWeightId,
        stockId = stockId.toStockDto(),
        weight = weight
    )