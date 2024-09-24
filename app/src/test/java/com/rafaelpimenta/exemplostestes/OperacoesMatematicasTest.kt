package com.rafaelpimenta.exemplostestes

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class OperacoesMatematicasTest {

    private lateinit var operacoesMatematicas: OperacoesMatematicas

    @Before
    fun setUp() {
        operacoesMatematicas = OperacoesMatematicas()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun somar_calculaSomaEntreDoisNumeros_retornaVerdadeiro() {

        //Given
        val numero1 = 10
        val numero2 = 10
        val numeroEsperado = 20

        //When
        val numeroRetornado = operacoesMatematicas.somar(numero1, numero2)
        val resultado = numeroRetornado == numeroEsperado

        //Then
        assertTrue(resultado)
//        assertEquals(numeroEsperado, numeroRetornado)
//        assertNotEquals(numeroEsperado, numeroRetornado)
//        assertFalse(resultado)
//        assertSame(operacoesMatematicas, OperacoesMatematicas())
    }
}