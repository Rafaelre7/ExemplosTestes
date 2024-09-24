package com.rafaelpimenta.exemplostestes.helper

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest

import org.junit.Before
import org.junit.Test

class OperacoesBasicasTest {

    //1 fazer a configuracao da classe que vai ser testada
    private lateinit var operacoesBasicas: OperacoesBasicas

    @Before
    fun setUp() {
        operacoesBasicas = OperacoesBasicas()
    }

    @Test
    fun formataData_aplicaFormatacaoData_retornaTrue() {
        //dado
        val dataSemFormatacao = "22102025"
        val dataEsperada = "22/10/2025"

        //quando
        val dataResultado = operacoesBasicas.formataData(dataSemFormatacao)


        //entao
        //verifica se a data esperada é igual do resultado
        assertThat(dataResultado).isEqualTo(dataEsperada)

    }

    @Test
    fun exibirAlerta_exibeAlertaUsuario_retornaTrue() {

        val retorno = operacoesBasicas.exibirAlerta()

        assertThat(retorno).isTrue()
    }

    @Test
    fun recuperarDaddosAPI_recuperarListaNomes_retornalistaPreenchida() = runTest {

        val lista = operacoesBasicas.recuperarDaddosAPI()

        assertThat(lista).isNotEmpty()

    }
}