package br.com.curso.extension

import br.com.curso.application.`in`.CadastrarVeiculoCommand
import br.com.curso.application.`in`.ObterVeiculoPorIdQuery
import br.com.curso.application.out.CadastrarVeiculoCommandResponse
import br.com.curso.application.out.VeiculoQueryResponse
import br.com.curso.controller.request.CadastrarVeiculoRequest
import br.com.curso.controller.response.CadastrarVeiculoResponse
import br.com.curso.controller.response.VeiculoResponse
import br.com.curso.domain.Veiculo
import br.com.curso.infrastructure.model.VeiculoModel

fun VeiculoModel.toDomain() : Veiculo{
    return Veiculo(this.id, this.modelo, this.marca, this.anoFabricacao, this.anoModelo, this.placa)
}

fun Veiculo.toModel() : VeiculoModel{
    return VeiculoModel(this.id, this.modelo, this.marca, this.anoFabricacao, this.anoModelo, this.placa)
}

fun CadastrarVeiculoCommand.toDomain() : Veiculo{
    return Veiculo(null, this.modelo, this.marca, this.anoFabricacao, this.anoModelo, this.placa)
}
fun CadastrarVeiculoRequest.toCommand() : CadastrarVeiculoCommand{
    return CadastrarVeiculoCommand(this.modelo, this.marca, this.anoFabricacao, this.anoModelo, this.placa)
}


fun CadastrarVeiculoCommandResponse.toResponse() : CadastrarVeiculoResponse{
    return CadastrarVeiculoResponse(this.id)
}
fun VeiculoQueryResponse.toResponse() : VeiculoResponse{
    return VeiculoResponse(this.id, this.modelo, this.marca, this.anoFabricacao, this.anoModelo, this.placa)
}

fun VeiculoModel.toCommandResponse() : CadastrarVeiculoCommandResponse{
    return CadastrarVeiculoCommandResponse(this.id!!)
}

fun VeiculoModel.toQueryResponse() : VeiculoQueryResponse{
    return VeiculoQueryResponse(this.id!!, this.modelo, this.marca, this.anoFabricacao, this.anoModelo, this.placa )
}

fun Long.toQuery(): ObterVeiculoPorIdQuery {
    return  ObterVeiculoPorIdQuery(this)
}