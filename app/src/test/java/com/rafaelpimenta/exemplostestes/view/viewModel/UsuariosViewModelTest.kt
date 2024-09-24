package com.rafaelpimenta.exemplostestes.view.viewModel

import com.google.common.truth.Truth.assertThat
import com.rafaelpimenta.exemplostestes.data.repository.UsuarioRepositoryImpl
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class) //falando que vai usar mockito
class UsuariosViewModelTest {

    private lateinit var usuariosViewModel: UsuariosViewModel

    @Mock
    private lateinit var mockUsuarioRepository: UsuarioRepositoryImpl

    //Caso ao utilizar o mock falar que a classe é final colocar um open
    @Before
    fun setUp() {
//        usuarioRepository = FakeUsuarioRepository()
//        usuarioRepository = mock(UsuarioRepository::class.java)

        //pega todos os mocks e inicializando
        MockitoAnnotations.openMocks(this)

        usuariosViewModel = UsuariosViewModel(mockUsuarioRepository)
    }

    @After
    fun tearDown() {
    }

    //verifica se a lista retornada nao é vazia 
    @Test
    fun getUsuarios() = runTest {

        //falando quando o mockito for executado criar uma lista conforme passada
        /* Mockito.`when`(usuarioRepository.listar()).thenReturn(
             listOf(Usuario(nome = "Rafael", email = "rafael@gmail.com"))
         )// dados ficticios*/

        //usando dados real
        Mockito.`when`(mockUsuarioRepository.listar()).thenCallRealMethod()

        val resultado = usuariosViewModel.getUsuarios()


        assertThat(
            resultado
        ).isNotEmpty()

    }
}