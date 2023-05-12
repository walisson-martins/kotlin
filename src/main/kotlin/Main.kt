fun main() {
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
}

open class Eletronico(private var marca: String) {
    private fun ativarCorrente() {}
    fun ligar() {
        ativarCorrente()
    }

   fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun software() {}
    fun processar() {}
}
