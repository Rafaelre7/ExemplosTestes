package com.rafaelpimenta.exemplostestes

class UsuarioSistema {

    fun cadastrarUsuario(
        email: String,
        senha: String,
        confirmaSenha: String
    ): Boolean {
        //cadastro de usuario

        if (email.isEmpty())
            return false

        if (senha.isEmpty())
            return false

        if (senha != confirmaSenha)
            return false

        return true
    }

    fun calcularDesconto(
        salario: Double,
        desconto: Double
    ): Double {
        return salario - desconto
    }

    fun logarUsuario() {

    }
}