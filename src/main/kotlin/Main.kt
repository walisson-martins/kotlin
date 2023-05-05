import kotlin.math.max

fun main() {
    helloWorld()
    sum(2, 3)
    println("${divisao(10f, 3.5f)}")

    val str = "Tamanho da String"

    println(max(5, 10))
}

fun sumRedux(a: Int, b: Int) = (a + b)

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

fun helloWorld(): Unit {
    println("Hello World")
}

fun divisao(a: Float, b: Float) = a / b

