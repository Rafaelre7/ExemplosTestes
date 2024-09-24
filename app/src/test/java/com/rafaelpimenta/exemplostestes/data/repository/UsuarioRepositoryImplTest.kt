package com.rafaelpimenta.exemplostestes.data.repository

import com.rafaelpimenta.exemplostestes.data.model.Usuario
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

class UsuarioRepositoryImplTest {

    private lateinit var usuarioRepository: UsuarioRepository

    @Before
    fun setUp() {
        usuarioRepository = UsuarioRepositoryImpl()
    }

    @After
    fun tearDown() {
    }

    //colocando o runBlocking pq esta rodando uma suspend fun
    //run test funcao do coroutines test removendo os delays no codigo no max 10seg de delay
    @Test
    fun salvar_dadosUsuarioAPI_retornaVerdadeiro() = runBlocking {
        //dado
        val usuario = Usuario("Rafael", "rafaelre7@gmail.com")

        //quando
        val retorno = usuarioRepository.salvar(usuario)

        //entao
        assertTrue(retorno)

    }

    //timeout coloca o tempo max de execucao
    @Test
    fun listar_temItensUsuariosAPI_retornaVerdadeiro() = runTest(timeout = 5.seconds) {
        //dado

        //quando
        val listaItens = usuarioRepository.listar()

        //entao
        assertTrue(listaItens.isNotEmpty())
    }
}