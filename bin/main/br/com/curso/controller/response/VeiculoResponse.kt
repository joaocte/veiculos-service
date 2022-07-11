package br.com.curso.controller.response

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob

data class VeiculoResponse(
    val id : Long,
    val modelo : String,
    val marca : String,
    val anoFabricacao : String,
    val anoModelo  : String,
    val placa : String,
    val valor : BigDecimal
)
