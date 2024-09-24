package com.rafaelpimenta.exemplostestes.data.repository

class ViagemRepositoryImpl : ViagemRepository {
    override suspend fun listarLocais(): List<Pair<String, String>> {
        //exemplo de utilizar com api
        return emptyList()
    }

    override suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double): Double {
        return 50.0
    }
}