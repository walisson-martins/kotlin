fun main() {
    val p = Pessoa(anoNascimento, nome)

    with(p) {
        acordar()
        dormir()
    }
}

class Receita {
  lateinit var instrucoes: String
  fun geraReceita() {
  }
}
