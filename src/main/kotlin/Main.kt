fun main() {
    endereco("street", "city", "DF", "73358315")
    endereco(cidade = "ci", rua = "street", estado = "Goias")
    media(1f, 2f, 3f)
}

//vararg - argumentos de parametros
fun <T> media(vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }
    }

    return (soma / notas.size)
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", num: Int = 0) {
}