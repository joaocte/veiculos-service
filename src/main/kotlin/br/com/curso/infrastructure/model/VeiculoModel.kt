package br.com.curso.infrastructure.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob

@Entity(name="veiculo")
data class VeiculoModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long?,
    @Column(length = 100, nullable = false)
    val modelo : String,
    @Column(length = 100, nullable = false)
    val marca : String,
    @Column(length = 4, nullable = false)
    val anoFabricacao : String,
    @Column(length = 4, nullable = false)
    val anoModelo  : String,
    @Column(length = 7, unique = true, nullable = false)
    val placa : String
)
