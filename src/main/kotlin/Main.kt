fun main() {
    portaria()
}

fun portaria() {
    println("Qual sua idade")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado")
            return
        }
    }

    println("Qual o tipo de convite")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {

            println("Qual o código do convite?")
            var codigo = readLine()

            if (codigo != null && codigo != "") {
                codigo = codigo.lowercase()
                if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                    println("Bem vindo")
                } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl")) {
                    println("Bem vindo")
                } else {
                    println("Negado: convite não encontrado")
                }
            }
        } else {
            println("Negado: convite inválido")
            return
        }
    }

}

fun square() {
    println("informe o lado 1:")
    val lado1 = readLine()

    println("informe o lado 2:")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("Quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {
    println("informe o lado 1:")
    val lado1 = readLine()

    println("informe o lado 2:")
    val lado2 = readLine()

    println("informe o lado 3:")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("Triângulo")
        } else {
            println("Não é um Triângulo")
        }
    }
}