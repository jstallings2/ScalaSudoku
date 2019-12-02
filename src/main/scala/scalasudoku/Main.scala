package scalasudoku

object Main {
  def main(args: Array[String]): Unit = {
    val filename = "sudoku-test1.txt" // text-file needs to be in project root directory
    val puzzle = new Sudoku
    println("\nLoading board from file: " + filename)
    puzzle.loadFromFile(filename)
    println("Puzzle is:\n")
    puzzle.displayBoard()
    println("Solution:\n")
    if (puzzle.solve()) puzzle.displayBoard() // Print solved puzzle.
    else println("No Solution") // Indicate there is no solution.
  }
}
