package com.rafaelpimenta.exemplostestes.data.repository

interface ViagemRepository {

    suspend fun listarLocais(): List<Pair<String, String>>

    suspend fun calcularPrecoViagem(distancia: Double, precoKM: Double): Double
}