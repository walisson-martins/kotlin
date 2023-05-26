interface Event {
    fun onSucess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexão")
        println("Salvando conexão")
        println("Sucesso. conexão pronta")
        e.onSucess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object : Event {
        override fun onSucess() {
            TODO("Not yet implemented")
        }
    })
}