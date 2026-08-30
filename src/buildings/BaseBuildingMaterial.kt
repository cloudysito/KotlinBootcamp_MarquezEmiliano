package buildings

// TASK 4: BEYOND THE BASICS
// Create a new package and file and call them Buildings.
// Create a class BaseBuildingMaterial with a property numberNeeded that is set to 1. You always need 1 of the base material.
// Create two subclasses, Wood and Brick. For BaseBuildingMaterial you need 4 units of wood or 8 units of brick. Now you have a type hierarchy.
// Create a generic class Building that can take any building material as its argument, and only building materials.
// A building always requires 100 base materials. Add a property baseMaterialsNeeded and set it to 100.
// Add another property, actualMaterialsNeeded and use a one-line function to calculate this from numberNeeded of the passed-in material.
// Add a method build() that prints the type and number of materials needed.
// Hint: Use reflection to get the class and simple name: instance::class.simpleName
// Create a main function and make a building using Wood.
open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<out T : BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded: Int get() = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun main() {
    val building = Building(Wood())
    building.build()
}