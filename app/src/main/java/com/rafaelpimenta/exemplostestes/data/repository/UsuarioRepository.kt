package com.rafaelpimenta.exemplostestes.data.repository

import com.rafaelpimenta.exemplostestes.data.model.Usuario

interface UsuarioRepository {

    suspend fun salvar(usuario: Usuario): Boolean

    suspend fun listar(): List<Usuario>
}