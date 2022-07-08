package br.com.curso.infrastructure

import br.com.curso.infrastructure.model.VeiculoModel
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface IVeiculoRepository : JpaRepository<VeiculoModel, Long>