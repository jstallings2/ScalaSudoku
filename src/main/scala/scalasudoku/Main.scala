package scalasudoku

import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    //val scanner = new Scanner(System.in)
    val filename = "src/main/sudoku-test1.txt" // text-file needs to be in src/main/
    var puzzle = new Sudoku
    println("\nLoading file: " + filename)

    // This reads the board line by line and simply prints it to output, no need to uncomment
    /*
    val bufferedSource = Source.fromFile(filename)
    println("Board: ")
    for (line <- bufferedSource.getLines) {
      println(line)
    }
    */

    puzzle.initializeBoard() // the hard-coded version with no file I/O

    // When fixed, this is the method to initalize the board from the text file
    // TODO: Uncomment this when fixed
    //puzzle.loadFromFile(filename)



    /*
    println("Puzzle:\n")
    println(puzzle)
    println("Solution:\n")
    if (puzzle.solve) println(puzzle) // Print solved puzzle.
    println("No Solution") // Indicate there is no solution.
     */
  }
}
