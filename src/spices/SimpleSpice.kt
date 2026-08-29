package spices

// TASK 1: CLASSES
// Create class, SimpleSpice.
// Let the class be a property with a String for the name of the spice, and a String for the level of spiciness.
// Set the name to curry and the spiciness to mild.
// Using a string for spiciness is nice for users, but not useful for calculations. Add a heat property to your class with a getter that returns a numeric value for spiciness. Use a value of 5 for mild.
// Create an instance of SimpleSpice and print out its name and heat.
class SimpleSpice {
    val spiceName: String = "curry"
    val spiciness: Spiciness = Spiciness.MILD
    val heat: Int
        get() = when (spiciness) {
            Spiciness.MILD -> 5
            Spiciness.MEDIUM -> 10
            Spiciness.HOT -> 15
        }
}

val listOfSpices = listOf(
    Spice("curry", Spiciness.MILD),
    Spice("pepper", Spiciness.MEDIUM),
    Spice("cayenne", Spiciness.HOT),
    Spice("ginger", Spiciness.MILD),
    Spice("red curry", Spiciness.MEDIUM),
    Spice("green curry", Spiciness.HOT),
    Spice("red pepper", Spiciness.HOT)
)

val spicySpices = listOfSpices.filter { it.heat >= 10 }
val mildOrLessSpices = listOfSpices.filter { it.heat < 10 }
