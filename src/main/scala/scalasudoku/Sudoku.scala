package scalasudoku

import scala.io.Source

class Sudoku {

  private val DIM = 9
  private var board = Array.ofDim[Int](DIM,DIM)


  /**
    * Load a sudoku puzzle from a file specified by filename.
    * @note "line" is an Iterator. Calling next() returns the next char of the line.
    * @param filename the relative path of the text file.
    */
  def loadFromFile(filename: String): Unit = {
    val bufferedSource = Source.fromFile(filename)
    println("Board: ")
    for(i <- 0 until DIM) {
      var line = bufferedSource.getLines() // get one line of text
      for(j <- 0 until DIM) {
        board(i)(j) = line.next().toInt // get the next char and cast to Int
        // FIXME: Keep getting java.lang.NumberFormatException. Think it may be trying to convert the whitespace to int
      }
      println(line)
    }
  }

  /**
    * Display the board nicely formatted manner
    */
  def displayBoard() : Unit= {
    // TODO
  }

  // Display a nicely formatted line of the board
  def rowToString(row: Int) : String = {
    var out = ""
    for(i <- 0 until DIM) {
      var a = board(i)(row)
      if(a == 0)
        out += " "
      else
        out += a.toString

      out += " "

      if(i == 2 || i == 5)
        out += "| "
    }
    out + "\n"
  }

  /**
    * Initialize the board to all 0's
    */
  def initializeBoard() : Unit= {
    for(ii <- 0 until DIM) {
      for(jj <- 0 until DIM) {
        board(ii)(jj) = 0
      }
    }

    // Hard coding the board so we don't have to have file I/O working to test the rest
    // This is the board from sudoku-test1.txt
    board(0)(1) = 4
    board(0)(2) = 3
    board(0)(4) = 8
    board(0)(6) = 2
    board(0)(7) = 5

    board(1)(0) = 6

    board(2)(5) = 1
    board(2)(7) = 9
    board(2)(8) = 4

    board(3)(0) = 9
    board(3)(5) = 4
    board(3)(7) = 7

    board(4)(3) = 6
    board(4)(5) = 8

    board(5)(1) = 1
    board(5)(3) = 2
    board(5)(8) = 3

    board(6)(0) = 8
    board(6)(1) = 2
    board(6)(3) = 5

    board(7)(8) = 5

    board(8)(1) = 3
    board(8)(2) = 4
    board(8)(4) = 9
    board(8)(6) = 7
    board(8)(7) = 1


  }



  // TODO: Row, column, subsquare checks

  // TODO: Write solver


}
