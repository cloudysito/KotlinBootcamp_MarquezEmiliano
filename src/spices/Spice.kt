package spices

// TASK 2: CLASSES
// Create a new class, Spice.
// Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
// Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
// Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
// Add an init block that prints out the values for the object after it has been created. Create a spice.
// Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
// Because salt is a very common spice, create a helper function called makeSalt().

// TASK 4: CLASSES
// Let's go back to your spices. Make Spice an abstract class, and then create some subclasses that are actual spices.
// It's easiest (organizationally) if you make a new package, Spices, with a file, Spice, that has a main() function.
// Copy/paste your Spice class code into that new file.
// Make Spice abstract.
// Create a subclass, Curry. Curry can have varying levels of spiciness, so we don't want to use the default value, but rather pass in the spiciness value.
// Spices are processed in different ways before they can be used. Add an abstract method prepareSpice to Spice, and implement it in Curry.
// Curry is ground into a powder, so let's call a method grind(). However, grinding is something that's not unique to curry, or even to spices, and it's always done in a grinder. So we can create an Interface, Grinder, that implements the grind() method. Do that now.
// Then add the Grinder interface to the Curry class.
interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

sealed class Spice(
    val name: String,
    val spiciness: Spiciness = Spiciness.MILD,
    color: SpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()

    val heat: Int
        get() = when (spiciness) {
            Spiciness.MILD -> 5
            Spiciness.MEDIUM -> 10
            Spiciness.HOT -> 15
        }
}

class Curry(
    name: String,
    spiciness: Spiciness = Spiciness.MILD,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        println("Preparing $name")
    }

    override fun grind() {
        println("Grinding $name")
    }
}

enum class Spiciness { MILD, MEDIUM, HOT }
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}