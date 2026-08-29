package spices

// TASK 2: CLASSES
// Create a new class, Spice.
// Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
// Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
// Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
// Add an init block that prints out the values for the object after it has been created. Create a spice.
// Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
// Because salt is a very common spice, create a helper function called makeSalt().
enum class Spiciness { MILD, MEDIUM, HOT }

class Spice(val name: String, val spiciness: Spiciness = Spiciness.MILD) {
    // Secondary constructor to match original task signature (spiciness as String) while keeping enum safety.
    constructor(name: String, spiciness: String = "mild") : this(
        name,
        when (spiciness.lowercase()) {
            "mild" -> Spiciness.MILD
            "medium" -> Spiciness.MEDIUM
            "hot" -> Spiciness.HOT
            else -> Spiciness.MILD
        }
    )

    val heat: Int
        get() = when (spiciness) {
            Spiciness.MILD -> 5
            Spiciness.MEDIUM -> 10
            Spiciness.HOT -> 15
        }

    init {
        println("Name: $name, Spiciness: ${spiciness.name.lowercase()}, Heat: $heat")
    }
}

fun makeSalt() = Spice("Salt", Spiciness.MILD)