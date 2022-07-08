package br.com.curso.application.`in`

data class CadastrarVeiculoCommand(
    val modelo : String,
    val marca : String,
    val anoFabricacao : String,
    val anoModelo  : String,
    val placa : String)