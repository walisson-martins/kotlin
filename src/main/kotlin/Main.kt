fun main() {
    val set1: Set<String> = setOf<String>("paris", "berlim", "paris")
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1.entries)
    println(map1.values)
    map2["Brasil"] = "Brasilia"
}