package spices

// TASK 5: CLASSES
// Create a simple data class, SpiceContainer, that holds one spice.
// Give SpiceContainer a property, label, that is derived from the name of the spice.
// Create some containers with spices and print out their labels.
data class SpiceContainer (var spice: Spice) {
    val label: String
        get() = spice.name
}