package br.com.curso.application.usecase.cadastrarVeiculo

import br.com.curso.application.`in`.CadastrarVeiculoCommand
import br.com.curso.application.out.CadastrarVeiculoCommandResponse
import br.com.curso.exception.custoException.AlreadyRegisteredException
import br.com.curso.extension.toCommandResponse
import br.com.curso.extension.toDomain
import br.com.curso.extension.toModel
import br.com.curso.infrastructure.IVeiculoRepository
import jakarta.inject.Singleton

@Singleton
class CadastarVeiculoUseCase (private val repository:IVeiculoRepository) : ICadastarVeiculoUseCase {
   override fun execute(cadastrarVeiculoCommand: CadastrarVeiculoCommand) : CadastrarVeiculoCommandResponse{
       val veiculoCadastrado = repository.existsByPlaca(cadastrarVeiculoCommand.placa);

       if(veiculoCadastrado)
           throw AlreadyRegisteredException()

       val veiculoDomain = cadastrarVeiculoCommand.toDomain()
       /* veiculoDomain.isValid()*/

      val response =  repository.save(veiculoDomain.toModel())

       return response.toCommandResponse()
    }
}