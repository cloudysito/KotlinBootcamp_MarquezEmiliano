package game

// TASK 1: FUNCTIONAL MANIPULATING
// Create a new file.
// Create an enum class, Directions, that has the directions NORTH, SOUTH, EAST and WEST, as well as START, and END.
// Create a class Game.
// Inside Game, declare a var, path, that is a mutable list of Direction. Initialize it with one element, START.
// Create 4 lambdas, north, south, east, and west, that add the respective direction to the path.
// Add another lambda, end, that:
// Adds END to path
// Prints “Game Over”
// Prints the path
// Clears the path
// Returns false
// Create a main function.
// Inside main(), create an instance of Game.
// To test your code so far, in main() print the path, then invoke north, east, south, west, and end. Finally, print the path again.

// TASK 3: FUNCTIONAL MANIPULATING
// In this practice, you will finish your simple game using higher-order functions, that is, a function that takes functions as an argument.
// In the game class, create a function move() that takes an argument called where, which is a lambda with no arguments that returns Unit.
// Hint: Declaring a function that takes a lambda as its argument:
// fun move(where: () -> Boolean )
// Inside move(), invoke the passed-in lambda.
// In the Game class, create a function makeMove() that takes a nullable String argument and returns nothing.
// Inside makeMove, test whether the String is any of the 4 directions and invoke move() with the corresponding lambda. Otherwise,
// invoke move() with end.
// Hint: You can call the function like this:
// move(north)
// In main() add a while loop that is always true.
// Inside the loop, print instructions to the player:
// print("Enter a direction: n/s/e/w:")
// Call makeMove() with the contents of the input from the user via readLine()
// Remove the code for testing the first version of your game.
// Run your program.
enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)

    val north: () -> Unit = { path.add(Directions.NORTH) }
    val south: () -> Unit = { path.add(Directions.SOUTH) }
    val east: () -> Unit = { path.add(Directions.EAST) }
    val west: () -> Unit = { path.add(Directions.WEST) }
    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> {
                move { end() }
            }
        }
    }
}

fun main() {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}
