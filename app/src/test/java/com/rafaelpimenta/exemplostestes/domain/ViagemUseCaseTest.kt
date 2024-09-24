package com.rafaelpimenta.exemplostestes.domain

import com.google.common.truth.Truth.assertThat
import com.rafaelpimenta.exemplostestes.data.repository.FakeViagemRepository
import kotlinx.coroutines.test.runTest

import org.junit.After
import org.junit.Before
import org.junit.Test

class ViagemUseCaseTest {

    private lateinit var viagemUseCase: ViagemUseCase

    //utiliza fake pq ja teria teste de repository o fake executa mais rapido
    private lateinit var fakeViagemRepository: FakeViagemRepository

    @Before
    fun setUp() {
        fakeViagemRepository = FakeViagemRepository()
        viagemUseCase = ViagemUseCase(fakeViagemRepository)
    }

    //verifica se a lista de locais nao esta vazia usando apenas use case para testes com fake
    @Test
    fun listarLocais() = runTest {

        val lista = viagemUseCase.listarLocais()

        assertThat(lista).isNotEmpty()
    }

    @Test
    fun calcularPrecoViagem() = runTest {
        val distancia = 10.0
        val precoKM = 5.0
        val retornoEsperado = 50.0

        val retorno = viagemUseCase.calcularPrecoViagem(distancia, precoKM)

        assertThat(retorno).isEqualTo(retornoEsperado)


    }

    @After
    fun tearDown() {
    }
}