package books

const val MAX_BOOKS_BORROWED = 5

// TASK 1: BEYOND THE BASICS
// Let’s create a basic book class, with a title, author, and year. Of course, you could get each of the properties separately.
// Create a method that returns both the title and the author as a Pair.
// Create a method that returns the title, author and year as a Triple. Use the documentation(opens in a new tab) to find out how to use Triple.
// Create a book instance.
// Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”
class Book2 {
    val title: String = "The Great Gatsby"
    val author: String = "F. Scott Fitzgerald"
    val year: Int = 1925
    var pages: Int = 180

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun printBookInfo() {
        val (title, author) = getTitleAndAuthor()
        val (_, _, year) = getTitleAuthorAndYear()
        println("Here is your book $title written by $author in $year.")
    }

    fun canBorrow(currentBorrowedBooks: Int): Boolean {
        return currentBorrowedBooks < MAX_BOOKS_BORROWED
    }

    fun printUrl() {
        println("${Constants.BASE_URL}$title.html")
    }

    companion object Constants {
        const val BASE_URL = "https://library.example.com/catalog/"
    }

}

fun Book2.weight(): Double {
    return pages * 1.5
}

fun Book2.tornPages(tornPages: Int) {
    pages = (pages - tornPages).coerceAtLeast(0)
}

class Puppy {
    fun playWithBook(book: Book2) {
        val pagesToTear = (1..12).random()
        book.tornPages(pagesToTear)
    }
}

// TASK 2: BEYOND THE BASICS
// Create a Set of book titles called allBooks, for example, by William Shakespeare.
// Create a Map called library that associates the set of books, allBooks, to the author.
// Use the collections function any() on library to see if any of the books are "Hamlet"
// Create a MutableMap called moreBooks, and add one title/author to it.
// Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
val allBooks = setOf("Hamlet", "Macbeth", "Romeo and Juliet")
val library = mapOf(
    "William Shakespeare" to allBooks
)
val hasHamlet = library.any { (_, books) -> "Hamlet" in books }
val moreBooks = mutableMapOf("The Tempest" to "William Shakespeare")

fun addBookIfMissing(title: String, author: String): String {
    return moreBooks.getOrPut(title) { author }
}

fun main() {
    val book = Book2()
    book.printBookInfo()
    println("Can borrow with 3 books: ${book.canBorrow(3)}")
    book.printUrl()
    println("Library has Hamlet: $hasHamlet")
    println("Author for Othello: ${addBookIfMissing("Othello", "William Shakespeare")}")

    val puppy = Puppy()
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Pages left: ${book.pages}, weight: ${book.weight()} grams")
    }
}

// TASK 3: BEYOND THE BASICS
// Create a top-level constant for the maximum number of books a person could borrow.
// Inside the Book class, create a method canBorrow() that returns true or false depending on whether a
// user has already borrowed the max number of books.
// Create a Constants object that provides constants to the book. For this example, provide the BASE_URL
// for all books in the library catalog. Inside Book, add a method printUrl that creates and prints a URL
// composed of BASE_URL, the book title, and “.html”.
// The base URL is really of interest to the Book class. As such, it makes sense to limit its scope to the
// Book class. Use a companion object to define the constant in Book.
