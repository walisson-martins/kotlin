fun main() {
    val data = listaDeDados()
    data.any()
    data.count()

    println("Primeira receita ${data.first()}")
    println("Ultima receita ${data.last()}")

    listOf<Int>(1, 2, 3).sum()
    println(data.sumOf { it.calorias })

    data.filter { it.nome == "Lasanha" }

    //pega as duas primeiras e duas últimas
    data.take(2)
    data.takeLast(2)

    data.filter { it.calorias > 100 }.forEach { println(it.nome) }
    data.forEach { println(it.nome) }

    data.maxOf { it.calorias }
    data.minOf { it.calorias }

    listOf<Int>(1, 3, 4).maxOf { it }
    listOf<Int>(1, 3, 4).maxOfOrNull { it }

    //Retorna o objeto
    println(data.maxByOrNull { it.calorias })

    data.map { it.nome }
}

private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)