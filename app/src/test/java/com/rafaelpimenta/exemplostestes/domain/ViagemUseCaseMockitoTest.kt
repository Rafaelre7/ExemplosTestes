package com.rafaelpimenta.exemplostestes.domain

import com.google.common.truth.Truth.assertThat
import com.rafaelpimenta.exemplostestes.data.repository.ViagemRepositoryImpl
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyDouble
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ViagemUseCaseMockitoTest {

    private lateinit var viagemUseCase: ViagemUseCase

    @Mock
    private lateinit var mockViagemRepositoryImpl: ViagemRepositoryImpl

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        viagemUseCase = ViagemUseCase(mockViagemRepositoryImpl)
    }

    //verifica se a lista de locais nao esta vazia usando apenas use case para testes com fake
    @Test
    fun listarLocais() = runTest {

        Mockito.`when`(mockViagemRepositoryImpl.listarLocais()).thenReturn(
            listOf(
                Pair("12025454", "1251210454"),
                Pair("12025435", "1251210455"),
                Pair("12025436", "1251210456"),
                Pair("12025437", "1251210457")
            )
        )

        val lista = viagemUseCase.listarLocais()

        assertThat(lista).isNotEmpty()
    }

    @Test
    fun calcularPrecoViagem() = runTest {
        val distancia = 10.0
        val precoKM = 5.0
        val retornoEsperado = 50.0

        Mockito.`when`(
            mockViagemRepositoryImpl.calcularPrecoViagem(
                anyDouble(), anyDouble()// esse valor nao vai ser usando
            )
        ).thenReturn(
            50.0
        )

        val retorno = viagemUseCase.calcularPrecoViagem(distancia, precoKM)

        assertThat(retorno).isEqualTo(retornoEsperado)


    }

    @After
    fun tearDown() {
    }
}