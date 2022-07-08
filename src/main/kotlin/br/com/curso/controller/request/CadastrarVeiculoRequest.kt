package br.com.curso.controller.request

data class CadastrarVeiculoRequest(
    val modelo : String,
    val marca : String,
    val anoFabricacao : String,
    val anoModelo  : String,
    val placa : String
    )