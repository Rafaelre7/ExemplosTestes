package com.rafaelpimenta.exemplostestes.helper

class OperacoesBasicas {

    fun formataData(data: String): String {
        //simular formatacao de data
        return "22/10/2025"
    }

    fun exibirAlerta(): Boolean {

        return true
    }

    suspend fun recuperarDaddosAPI(): List<String> {

        return listOf(
            "rafael", "jessica", "eduardo", "elaine"
        )
    }
}