package br.com.curso.application.usecase.cadastrarVeiculo

import br.com.curso.application.`in`.CadastrarVeiculoCommand
import br.com.curso.application.out.CadastrarVeiculoCommandResponse

interface ICadastarVeiculoUseCase {
    fun execute(cadastrarVeiculoCommand: CadastrarVeiculoCommand) : CadastrarVeiculoCommandResponse
}