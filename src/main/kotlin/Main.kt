interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(func: Funcionario) {
    println(func.bonus())
}

fun main() {
    mostraBonus(Gerente(100.0f))
    mostraBonus(Analista(100.0f))

    try {

    } catch (e: NullPointerException) {

    }
}