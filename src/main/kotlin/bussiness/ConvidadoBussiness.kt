package bussiness

import entity.Convidado

class ConvidadoBussiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int) = idade < 18
    fun codigoValido(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }
}