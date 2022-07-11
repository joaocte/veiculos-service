package br.com.curso.application.out

import java.math.BigDecimal

data class VeiculoQueryResponse(
    val id : Long,
    val modelo : String,
    val marca : String,
    val anoFabricacao : String,
    val anoModelo  : String,
    val placa : String,
    val valor : BigDecimal
)
