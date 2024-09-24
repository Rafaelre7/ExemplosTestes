package com.rafaelpimenta.exemplostestes.domain

import com.rafaelpimenta.exemplostestes.data.repository.ViagemRepository

class ViagemUseCase(private val viagemRepository: ViagemRepository) {

    suspend fun listarLocais(): List<Pair<String, String>> {

        return viagemRepository.listarLocais()
    }

    suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double): Double {
        //Recuperar dados da API: Distancia como ex
        return viagemRepository.calcularPrecoViagem(distancia, precoKM)
    }
}