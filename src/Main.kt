//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun printHello() {
        println("Hello World")
    }

    printHello()

    // TASK 1: OPERATORS
    // If you start with 2 fish, and they breed twice, producing 71 offspring the first time, and 233 offspring the second time,
    // and then 13 fish are swallowed by a hungry moray eel, how many fish do you have left? How many aquariums do you need if you
    // can put 30 fish per aquarium?
    println(2.plus(71).plus(233).minus(13).div(30))

    // TASK 2: OPERATORS
    // Create a String variable rainbowColor, set its color value, then change it.
    // Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
    var rainbowColor = "Red"
    rainbowColor = "Orange"

    val blackColor = "Black"
    // blackColor = "White" <-- ERROR

    // TASK 3: OPERATORS
    // Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
    // Use two different ways of setting them to null.

    // rainbowColor = null <-- ERROR
    var greenColor : String? = "Green"
    greenColor = null

    val blueColor : String? = null

    // TASK 4: OPERATORS
    // Create a list with two elements that are null; do it in two different ways.
    // Next, create a list where the list is null.
    val list : List<String?> = listOf(null, null)
    val list2 : MutableList<String?> = mutableListOf(null, null)
    val list3 : List<String>? = null

    // TASK 5: OPERATORS
    // Create a nullable integer variable called nullTest, and set it to null. Use a null-check that increases
    // the value by one if it's not null, otherwise returns 0, and prints the result.
    val nullTest : Int? = null
    val result = nullTest?.plus(1) ?: 0
    println(result)

    // TASK 1: STRINGS
    // Create three String variables for trout, haddock, and snapper.
    // Use a String template to print whether you do or don't like to eat these kinds of fish.}
    val trout = "trout"
    val haddlock = "haddlock"
    val snapper = "snapper"

    println("I like $snapper and $trout, but I don't like $haddlock.")

    // TASK 2: STRINGS
    // when statements in Kotlin are like case or switch statements in other languages.
    // Create a when statement with three comparisons:
    // If the length of the fishName is 0, print an error message.
    // If the length is in the range of 3...12, print "Good fish name".
    // If it's anything else, print "OK fish name".
    val fishName = "fish"
    when (fishName.length) {
        0 -> println("Error: Fish name cannot be empty.")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }

    

}