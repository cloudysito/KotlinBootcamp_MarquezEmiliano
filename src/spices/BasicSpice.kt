package spices

class BasicSpice(name: String, spiciness: Spiciness = Spiciness.MILD) : Spice(name, spiciness, color = object : SpiceColor {
    override val color = "white"
}) {
    override fun prepareSpice() {
        println("No special preparation needed for $name")
    }
}
