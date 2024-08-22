package com.rafaelpimenta.exemplostestes

import junit.framework.TestCase.assertTrue
import org.junit.Test

class UsuarioTest {

    @Test
    fun testCadastroUsuarioRetornoVerdadeiro() {

        //Given(dado)
        val email = "rafaelre7@gmail.com"
        val senha = "1234567"

        //When(quando)
        val usuario = Usuario()
        val retorno = usuario.cadastrarUsuario(email, senha)

        //Then(entao)
        assertTrue(retorno) //assertTrue verifica se o retorno é verdadeiro

    }
}
