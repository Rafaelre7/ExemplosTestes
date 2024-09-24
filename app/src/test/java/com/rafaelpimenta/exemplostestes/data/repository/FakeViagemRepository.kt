package com.rafaelpimenta.exemplostestes.data.repository

class FakeViagemRepository : ViagemRepository {
    override suspend fun listarLocais(): List<Pair<String, String>> {
        return listOf(
            Pair("12025454", "1251210454"),
            Pair("12025435", "1251210455"),
            Pair("12025436", "1251210456"),
            Pair("12025437", "1251210457")
        )
    }

    override suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double): Double {
        return distancia * precoKM
    }
}