package br.com.curso.application.usecase.obterVeiculo

import br.com.curso.application.`in`.ObterVeiculoPorIdQuery
import br.com.curso.application.out.VeiculoQueryResponse

interface IObterVeiculoPorIdUseCase {
    fun execute(obterVeiculoPorIdQuery: ObterVeiculoPorIdQuery) : VeiculoQueryResponse
}