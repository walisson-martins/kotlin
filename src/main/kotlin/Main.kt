class Matematica {

    companion object {
        val PI = 3.1415
        fun funcao() {}
    }

    object obj {
        val PI = 3.1415
        fun funcao() {}
    }
}

fun main() {
    Matematica.PI
    Matematica.funcao()
    Matematica.obj.PI
}