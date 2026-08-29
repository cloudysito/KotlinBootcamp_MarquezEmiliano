package spices

fun main() {
    val simpleSpice = SimpleSpice()
    println("Simple Spice: ${simpleSpice.spiceName}, Heat: ${simpleSpice.heat}")

    val spices = listOf(
        Curry("curry", Spiciness.MILD),
        BasicSpice("pepper", Spiciness.MEDIUM),
        BasicSpice("cayenne", Spiciness.HOT),
        BasicSpice("ginger", Spiciness.MILD),
        Curry("red curry", Spiciness.MEDIUM),
        Curry("green curry", Spiciness.HOT),
        BasicSpice("salt", Spiciness.MILD),
        BasicSpice("red pepper", Spiciness.HOT)
    )

    println("All Spices:")
    spices.forEach { spice ->
        println("${spice.name}, Color: ${spice.color}, Spiciness: ${spice.spiciness.name.lowercase()}, Heat: ${spice.heat}")
    }
}