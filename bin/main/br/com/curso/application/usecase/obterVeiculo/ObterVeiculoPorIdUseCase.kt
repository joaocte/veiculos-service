package br.com.curso.application.usecase.obterVeiculo

import br.com.curso.application.`in`.ObterVeiculoPorIdQuery
import br.com.curso.application.out.VeiculoQueryResponse
import br.com.curso.exception.custoException.NotFoundException
import br.com.curso.extension.toCommandResponse
import br.com.curso.extension.toQueryResponse
import br.com.curso.infrastructure.IVeiculoRepository
import jakarta.inject.Singleton

@Singleton
class ObterVeiculoPorIdUseCase(private val repository: IVeiculoRepository)  : IObterVeiculoPorIdUseCase{
    override fun execute(obterVeiculoPorIdQuery: ObterVeiculoPorIdQuery) : VeiculoQueryResponse {

        var veiculoModel = repository.findById(obterVeiculoPorIdQuery.id)

        if(!veiculoModel.isPresent)
            throw NotFoundException()

        return veiculoModel.get().toQueryResponse()
    }
}