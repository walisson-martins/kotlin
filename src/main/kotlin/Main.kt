import java.lang.Exception

fun main() {
    try {
        val str: String? = null
        println(str ?: "nulo")

        var str2 = if (str == null) "maior de idade" else "menor de idade"

        str?.let {
            it.lowercase()
            it.length
        }


    } catch (e: NullPointerException) {
        println("Variável inválida")
    } catch (e: ArithmeticException) {
        println("ArithmeticException inválida")
    } catch (e: Exception) {
        println("Exception")
    } finally {
        println("Finally")
    }
}
