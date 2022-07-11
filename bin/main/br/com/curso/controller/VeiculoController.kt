package br.com.curso.controller

import br.com.curso.application.usecase.cadastrarVeiculo.ICadastarVeiculoUseCase
import br.com.curso.application.usecase.obterVeiculo.IObterVeiculoPorIdUseCase
import br.com.curso.controller.request.CadastrarVeiculoRequest
import br.com.curso.controller.response.CadastrarVeiculoResponse
import br.com.curso.controller.response.VeiculoResponse
import br.com.curso.extension.toCommand
import br.com.curso.extension.toQuery
import br.com.curso.extension.toResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post

@Controller("/veiculos")
class VeiculoController (
    private val cadastrarVeiculoUseCase: ICadastarVeiculoUseCase,
    private val obterVeiculoPorIdUseCase: IObterVeiculoPorIdUseCase)
{


    @Post
    fun cadastrarVeiculo(@Body cadastrarVeiculoRequest: CadastrarVeiculoRequest) : HttpResponse<CadastrarVeiculoResponse>
    {
        return HttpResponse.created(cadastrarVeiculoUseCase.execute(cadastrarVeiculoRequest.toCommand()).toResponse())
    }
    @Get("/{id}")
    fun cadastrarVeiculo(@PathVariable id: Long) : VeiculoResponse
    {
        return obterVeiculoPorIdUseCase.execute(id.toQuery()).toResponse()
    }
}

