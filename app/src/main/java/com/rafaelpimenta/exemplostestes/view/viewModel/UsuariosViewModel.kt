package com.rafaelpimenta.exemplostestes.view.viewModel

import com.rafaelpimenta.exemplostestes.data.model.Usuario
import com.rafaelpimenta.exemplostestes.data.repository.UsuarioRepository

class UsuariosViewModel(
    private val usuarioRepository: UsuarioRepository
) {

    suspend fun getUsuarios(): List<Usuario> {
        return usuarioRepository.listar()
    }
}