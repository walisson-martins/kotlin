class Animal(var especie: String) {
    var fala: String = ""
        get() {
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            fala = value
        }

    init {
        fala = if (especie == "cachorro") {
            "au"
        } else if (especie == "gato") {
            "miau"
        } else {
            ""
        }
    }

    fun falar() {
        println(fala)
    }

    init {
        println("2 Animal")
    }
}

fun main() {
    val animal = Animal("cachorro")
    Animal("gato").falar()
    animal.falar()
}

