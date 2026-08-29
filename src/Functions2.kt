fun main() {

    // TASK 4: FUNCTIONS
    // Create a program that suggests an activity based on various parameters.
    // in a new file with a main function.
    // From main(), create a function, whatShouldIDoToday().
    // Let the function have three parameters.
    // mood: a required string parameter
    // weather: a string parameter that defaults to "sunny"
    // temperature: an Integer parameter that defaults to 24 (Celsius).
    // Use a when construct to return some activities based on combinations of conditions. For example:
    // mood == "happy" && weather == "Sunny" -> "go for a walk"
    // else -> "Stay home and read."
    // Copy/paste your finished function into REPL, and call it with combinations of arguments. For example:
    // whatShouldIDoToday("happy", "Sunny")
    // > go for a walk
    // whatShouldIDoToday("sad")
    // > Stay home and read.
    // Note: Keep your work as you will do more with this code in the next practice.

    // TASK 5: FUNCTIONS
    // Improve your whatShouldIDoToday() program with the new knowledge from this segment.
    // Add 3 more situations and activities. For example:
    // mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
    // temperature > 35 -> "go swimming"
    // Create a single-expression function for each condition and then use it in your when expression.
    // Challenge
    // Instead of passing in the mood, get a mood string from the user.
    // Hint: The !! operator may come handy.
    // Loops
    // This lesson introduced the while and repeat loops. To practice using them, do the following:
    // Change your fortune cookie program to use repeat() instead of a for loop. What happens to the break instruction?
    // Using the error message from the compiler, with what you've learned so far, can you think of why?
    // Change your fortune cookie program to use a while loop, which is the better choice when you are looping until a condition is met.

    fun isHappyAndSunny(mood: String, weather: String): Boolean =
        mood == "happy" && weather == "sunny"

    fun isSadAndRainy(mood: String, weather: String): Boolean =
        mood == "sad" && weather == "rainy"

    fun isExcitedAndHot(temperature: Int): Boolean =
        temperature > 30

    fun isRainyAndCold(weather: String, temperature: Int): Boolean =
        weather == "rainy" && temperature == 15

    fun isVeryHot(temperature: Int): Boolean =
        temperature > 35

    fun isFreezing(temperature: Int): Boolean =
        temperature < 0

    fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
        return when {
            isHappyAndSunny(mood, weather) -> "go for a walk"
            isSadAndRainy(mood, weather) -> "stay home and read"
            isExcitedAndHot(temperature) -> "go to the beach"
            isRainyAndCold(weather, temperature) -> "stay in bed"
            isVeryHot(temperature) -> "go swimming"
            isFreezing(temperature) -> "stay home and read by the fireplace"
            else -> "Stay home and read."
        }
    }

    println("--------------------------")
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    println("--------------------------")
    println("")

    println(whatShouldIDoToday("happy", "sunny", 24))
    println(whatShouldIDoToday("sad", "rainy", 15))
    println(whatShouldIDoToday("excited", "sunny", 32))
    println(whatShouldIDoToday("happy", "rainy", 0))

    // TASK 6: FUNCTIONS
    // Create a filter that gets all the curries and sorts them by string length.
    // Hint: After you type the dot (.), IntelliJ will give you a list of functions you can apply.
    // Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
    // Take the first three elements of the list and return the ones that start with 'c'.
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    spices.filter { it.contains("curry") }.sortedBy { it.length }
    spices.filter { it.startsWith('c') && it.endsWith('e') }
    spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    spices.take(3).filter { it.startsWith('c') }

    // TASK 7: FUNCTIONS
    // Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
    // Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
    // If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
    // Create a new variable, rollDice2, for this same lambda using the function type notation.
    val rollDice = { sides: Int ->
        if (sides == 0) 0 else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    // TASK 8: FUNCTIONS
    // Why would you want to use the function type notation instead of just the lambda?
    // Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
    // Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.
    fun gamePlay(roll: (Int) -> Int) {
        println("You rolled a ${roll(6)}")
    }
    gamePlay(rollDice2)

}
