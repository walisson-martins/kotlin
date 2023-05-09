class Pessoa(val anoNascimento: Int, var nome: String) {
    var documento: String = ""
    constructor(anoNascimento: Int, nome: String, documento: String): this(anoNascimento, nome) {
        this.documento = documento
    }
    fun dormir() {
    }
    fun acordar() {
    }
}

class vazia private constructor()

fun main() {
    val pessoa: Pessoa = Pessoa(2000, "Walisson")

    println(pessoa.nome)
    pessoa.acordar()
    pessoa.dormir()
}
