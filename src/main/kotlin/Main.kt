import kotlin.math.max

fun main() {
    convertYears(2)
    caracters("calculo de string")
    cubo(3)
    converteMilhas(1.00f)
    trocaLetras("asdxa asd cx")
    maiorDeIdade(15)

    val bonus = bonus("Gerente")
    println(bonus)
}

fun bonus(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus
}

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade")
    } else if (idade < 10) {
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean) = if (dia) {
    "Bom dia"
} else {
    "Boa noite"
}

fun retorno(valor: Int): Int {
    return if (valor != 10) {
        10
    } else {
        20
    }
}

fun trocaLetras(str: String): String {
    return str.replace("A", "x").lowercase()
}

fun converteMilhas(milhas: Float) = milhas * 1.6F

fun cubo(n: Int): Int {
    return n * n * n
}

fun caracters(str: String): Int {
    return str.length
}

fun convertYears(year: Int) {
    println("$year anos equivale a:")
    println("${year * 12} meses:")
    println("${year * 365} dias:")
    println("${year * 365 * 24} horas:")
    println("${year * 365 * 24 * 60} minutos:")
    println("${year * 365 * 24 * 60} segundos:")
}