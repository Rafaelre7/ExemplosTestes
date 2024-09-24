package com.rafaelpimenta.exemplostestes.data.repository

import com.rafaelpimenta.exemplostestes.data.model.Usuario

class FakeUsuarioRepository : UsuarioRepository {
    override suspend fun salvar(usuario: Usuario): Boolean {
        return true
    }

    override suspend fun listar(): List<Usuario> {
        return listOf(
            Usuario(nome = "Rafael", email = "rafaelre7@gmail.com"),
            Usuario(nome = "Eduardo", email = "eduardo@gmail.com"),
            Usuario(nome = "Dias", email = "dias@gmail.com"),
            Usuario(nome = "Pimenta", email = "pimenta@gmail.com")
        )
    }
}