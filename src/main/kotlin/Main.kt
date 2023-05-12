open class Eletronico(var marca: String) {
    private fun corrente(ativo: Boolean) {}
    fun ligar() {
        corrente(false)
    }

    open fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun save() {}

    override fun desligar() {
        save()
        super.desligar()
    }

    fun save(a: Int) {
    }

    fun save(a: Double) {
    }
}

fun main() {
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
}