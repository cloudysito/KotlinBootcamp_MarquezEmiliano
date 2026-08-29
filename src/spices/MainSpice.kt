package spices

fun main() {
    val simpleSpice = SimpleSpice()
    println("Simple Spice: ${simpleSpice.spiceName}, Heat: ${simpleSpice.heat}")

    val spices = listOf(
        Spice("curry", Spiciness.MILD),
        Spice("pepper", Spiciness.MEDIUM),
        Spice("cayenne", Spiciness.HOT),
        Spice("ginger", Spiciness.MILD),
        Spice("red curry", Spiciness.MEDIUM),
        Spice("green curry", Spiciness.HOT),
        makeSalt(),
        Spice("red pepper", Spiciness.HOT)
    )

    println("All Spices:")
    spices.forEach { spice ->
        println("${spice.name}, Spiciness: ${spice.spiciness.name.lowercase()}, Heat: ${spice.heat}")
    }
}