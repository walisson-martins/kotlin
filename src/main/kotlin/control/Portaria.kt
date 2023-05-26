package control

import bussiness.ConvidadoBussiness
import entity.Convidado

class Portaria {
    private val convidadoBussiness = ConvidadoBussiness()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade ?")
        val convidado = Convidado(idade = idade)

        if (convidadoBussiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Menores de idade não são permitidos"
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite?")
        if (!convidadoBussiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido"
        }

        convidado.codigo = Console.readString("Qual é o código de convite?")
        if (!convidadoBussiness.codigoValido(convidado)) {
            return "Negado. Convite inválido"
        }

        return "Welcome"
    }
}