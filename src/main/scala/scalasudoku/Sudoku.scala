package scalasudoku

import scala.collection.mutable
import scala.io.Source

class Sudoku {

  private val DIM = 9
  private var Board = Array.ofDim[Int](DIM,DIM)


  /**
    * Load a sudoku puzzle from a file specified by filename.
    * @note "line" is an Iterator. Calling next() returns the next char of the line.
    * @param filename the relative path of the text file.
    */
  def loadFromFile(filename: String): Unit = {
    // FIXME: Get it to stop throwing an exception
    val bufferedSource = Source.fromFile(filename)
    println("Board: ")
    for(i <- 0 until DIM) {
      val line = bufferedSource.getLines().toString().split(" ") // get one line of text
      for(j <- 0 until DIM) {
        val num = line(j).toInt // this always throws NumberFormatException, can't find way around
        Board(i)(j) = num
      }
    }
  }

  /**
    * Display the Board nicely formatted manner
    */
  def displayBoard() : Unit= {
    var out = ""
    for(i <- 0 until DIM) {
      out += rowToString(i)
      if(i == 2 || i == 5)
        out += midString()
    }
    println(out)
  }

  private def midString(): String = {"------+-------+------\n"}


  // Display a nicely formatted line of the Board
  def rowToString(row: Int) : String = {
    var out = ""
    for(i <- 0 until DIM) {
      var a = Board(i)(row)
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
    * Initialize the Board to all 0's
    */
  def initializeBoard() : Unit= {
    for(ii <- 0 until DIM) {
      for(jj <- 0 until DIM) {
        Board(ii)(jj) = 0
      }
    }

    // Hard coding the Board so we don't have to have file I/O working to test the rest
    // This is the Board from sudoku-test1.txt
    Board(0)(1) = 4
    Board(0)(2) = 3
    Board(0)(4) = 8
    Board(0)(6) = 2
    Board(0)(7) = 5

    Board(1)(0) = 6

    Board(2)(5) = 1
    Board(2)(7) = 9
    Board(2)(8) = 4

    Board(3)(0) = 9
    Board(3)(5) = 4
    Board(3)(7) = 7

    Board(4)(3) = 6
    Board(4)(5) = 8

    Board(5)(1) = 1
    Board(5)(3) = 2
    Board(5)(8) = 3

    Board(6)(0) = 8
    Board(6)(1) = 2
    Board(6)(3) = 5

    Board(7)(8) = 5

    Board(8)(1) = 3
    Board(8)(2) = 4
    Board(8)(4) = 9
    Board(8)(6) = 7
    Board(8)(7) = 1


  }

  /**
    * Entry point for the solver
    * @return true if the puzzle can be solved, false otherwise
    */
  def solve(): Boolean = getNext(0, -1)

  private def getPoss(row: Int, col: Int): List[Int] = {
    var poss = List[Int]()
    var taken = mutable.HashSet[Int]()

    for(i <- 0 until DIM) {
      taken.add(Board(row)(i))
    }

    for(i <- 0 until DIM) {
      taken.add(Board(i)(col))
    }

    val adjRow = (row / 3) * 3
    val adjCol = (col / 3) * 3
    for(sectRow <- adjRow until adjRow + 3) {
      for(sectCol <- adjCol until adjCol + 3) {
        if (!((sectRow == row) && (sectCol == col)))
          taken.add(Board(sectRow)(sectCol))
      }
    }

    for(i <- 1 until DIM + 1) {
      if(!taken.contains(i))
        poss = i +: poss // prepend to list
    }

    poss

  }


  private def getNext(row: Int, col: Int) : Boolean = {

    var tcol = col + 1

    for(trow <- row until DIM) {
      while(tcol < DIM) {
        if(Board(trow)(tcol) == 0) {
          return placeNum(trow, tcol)
        }
        tcol = tcol + 1
      }
      tcol = 0
    }
    true
  }


  private def placeNum(row: Int, col: Int): Boolean = {
    var poss = getPoss(row, col)

    while(poss.nonEmpty) {
      Board(row)(col) = poss.head // head doesn't remove the element from poss like pop does.
      // So we have to set poss to tail
      poss = poss.tail
      if(getNext(row, col)) return true
      Board(row)(col) = 0
    }
    false
  }
}
