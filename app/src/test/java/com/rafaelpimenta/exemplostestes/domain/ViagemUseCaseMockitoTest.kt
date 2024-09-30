package com.rafaelpimenta.exemplostestes.domain

import com.google.common.truth.Truth.assertThat
import com.rafaelpimenta.exemplostestes.data.repository.ViagemRepositoryImpl
import com.rafaelpimenta.exemplostestes.rules.RegraCustomizada
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
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

    //falando que é para usar a regra
    @get:Rule
    val regra = RegraCustomizada()

    @Before
    fun setUp() {
        println("setUp")
        MockitoAnnotations.openMocks(this)
        viagemUseCase = ViagemUseCase(mockViagemRepositoryImpl)
    }

    //verifica se a lista de locais nao esta vazia usando apenas use case para testes com fake
    @Test
    fun listarLocais() = runTest {
        println("Metodo listarLocais")
        regra.log = "100"
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
        println("Metodo calcularPrecoViagem")
        regra.log = "200"
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
        println("tearDown")
    }
}