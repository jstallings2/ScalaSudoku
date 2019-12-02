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
    val bufferedSource = Source.fromFile(filename)
    val matrixLines = bufferedSource.getLines
    val matrix = matrixLines.map(line => line.split(" ").map(_.toInt)).toArray
    bufferedSource.close
    Board = matrix
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
      val a = Board(i)(row)
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
    * Entry point for the solver
    * @return true if the puzzle can be solved, false otherwise
    */
  def solve(): Boolean = getNext(0, -1)

  private def getPoss(row: Int, col: Int): List[Int] = {
    var poss = List[Int]()
    val taken = mutable.HashSet[Int]()

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
