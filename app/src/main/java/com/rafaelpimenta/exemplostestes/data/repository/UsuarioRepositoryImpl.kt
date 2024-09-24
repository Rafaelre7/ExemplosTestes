package com.rafaelpimenta.exemplostestes.data.repository

import com.rafaelpimenta.exemplostestes.data.model.Usuario
import kotlinx.coroutines.delay

class UsuarioRepositoryImpl : UsuarioRepository {
    override suspend fun salvar(usuario: Usuario): Boolean {
        //codigos
        delay(2000)
        return true
    }


    override suspend fun listar(): List<Usuario> {
        println("Chamada execucao real do metodo")
        return listOf(
            Usuario(nome = "Rafael", email = "rafaelre7@gmail.com"),
            Usuario(nome = "Eduardo", email = "eduardo@gmail.com"),
            Usuario(nome = "Dias", email = "dias@gmail.com"),
            Usuario(nome = "Pimenta", email = "pimenta@gmail.com")
        )
    }
}