package com.rafaelpimenta.exemplostestes

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test

class UsuarioSistemaTest {

    //a cada teste antes da execucao é chamado o metodo
    @Before
    fun setUp() {

    }

    //a cada teste depois da execucao é chamado o metodo
    @After
    fun tearDown() {

    }

    @Test
    fun cadastrar_ValidarCadastroUsuario_RetornoVerdadeiro() {

        //Given(dado)
        val email = "rafaelre7@gmail.com"
        val senha = "1234567"
        val confirmaSenha = "1234567"

        //When(quando)
        val usuarioSistema = UsuarioSistema()
        val retorno = usuarioSistema.cadastrarUsuario(email, senha, confirmaSenha)

        //Then(entao)
        assertTrue(retorno) //assertTrue verifica se o retorno é verdadeiro

    }

    @Test
    fun cadastrar_ConfirmaSenha_RetornoFalso() {

        //Given(dado)
        val email = "rafaelre7@gmail.com"
        val senha = "1234567"
        val confirmaSenha = "7654321"

        //When(quando)
        val usuarioSistema = UsuarioSistema()
        val retorno = usuarioSistema.cadastrarUsuario(email, senha, confirmaSenha)

        //Then(entao)
        assertFalse(retorno) //assertTrue verifica se o retorno é verdadeiro

    }

    @Test
    fun calcular_DescontoSalario_RetornaTrue() {
        //Given
        val usuarioSistema = UsuarioSistema()
        val salario = 1000.0
        val desconto = 100.0
        val esperado = 900.0

        //When
        val salarioCalculado = usuarioSistema.calcularDesconto(salario, desconto)
        val testeConfirmacao = salarioCalculado == esperado

        //Then
        assertTrue(testeConfirmacao)
    }
}
