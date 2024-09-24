package com.rafaelpimenta.exemplostestes

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TruthTest {
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun TestTruth() {
//        assertThat("rafael").contains("rafael")
//        assertThat("rafael").doesNotContain("rafael") //caso queira usar a negacao

        val meuItem = listOf("rafael")
//        assertThat(//verifica se contem pelo menos um item
//            listOf("rafael", "eduardo")
//        ).containsAnyIn(meuItem)


//        assertThat(//verifica se contem a quantidade de itens esperado em uma lista
//            listOf("rafael", "eduardo")
//        ).hasSize(2)

//        assertThat(//verifica se contem a quantidade de itens esperado em uma string
//           "teste"
//        ).hasLength(5)

//        assertThat(//verifica se a lista nao é vazia
//            "teste"
//        ).isNotEmpty()

        val numero = 10
        assertThat(//verifica se contem um inteiro dentro do range de numeros
            numero
        ).isIn(8..20)
    }
}