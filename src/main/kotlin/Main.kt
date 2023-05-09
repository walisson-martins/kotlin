enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return super.toString()
        }
    },
    Media(5),
    Alta(10)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}

fun chamada(x: Prioridade) {}
fun main() {
    chamada(Prioridade.Media)
    for (p in Prioridade.values()) {
        println(p)
    }

    var f1: Forma = Forma(10, 8)
    var f2: Forma = Forma(10, 8)

    var f3: FormaData = FormaData(10, 8)
    var f4: FormaData = FormaData(10, 8)

    f1.equals(f2)
    //f1.equals()
    println(f1.toString())
    println(f1.hashCode())
    println(f2.toString())
    println(f2.hashCode())

    f4 = f3.copy()
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            return false
        }
    }
}

data class FormaData(val a: Int, val b: Int) {

}