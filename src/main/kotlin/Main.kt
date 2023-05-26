fun main() {

    val list1: List<Int> = listOf<Int>(1, 2, 3)
    val mtbl: MutableList<Int> = mutableListOf(1, 2, 3)

    println(mtbl[0])
    println(mtbl[1])

    mtbl.add(8)
    mtbl.remove(1)
    mtbl.removeAt(0)
    mtbl.clear()
    println(mtbl)
}