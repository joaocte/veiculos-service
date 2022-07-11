package br.com.curso.application.`in`

import java.math.BigDecimal

data class CadastrarVeiculoCommand(
    val modelo : String,
    val marca : String,
    val anoFabricacao : String,
    val anoModelo  : String,
    val placa : String,
    val valor : BigDecimal
    )