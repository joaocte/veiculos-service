package br.com.curso.application.out

data class VeiculoQueryResponse(
    val id : Long,
    val modelo : String,
    val marca : String,
    val anoFabricacao : String,
    val anoModelo  : String,
    val placa : String
)
