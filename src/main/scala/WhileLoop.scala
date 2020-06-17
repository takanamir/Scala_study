package main.scala

object WhileLoop {
  def main(args: Array[String]): Unit = {
    // while
    var i = 100
    while (i < 110) {
      print(i + " ") // 100から109
      i += 1 // i++
    }

    println("")

    // do-while
    var j = 110
    do {
      print(j + " ") // 110
      j += 1
    } while (j < 110)
  }
}