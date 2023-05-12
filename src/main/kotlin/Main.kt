interface Selvagem {
    fun atacar() {
        println("")
    }
}

abstract class Mamifero(val nome: String) {
    fun acordar() {}
    fun dormir() {}
    abstract fun falar()
    abstract fun comer()
}


class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }
}

fun main() {

}