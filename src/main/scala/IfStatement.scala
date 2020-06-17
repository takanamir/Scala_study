package main.scala

object IfStatement {
  def main(args: Array[String]): Unit = {
    // if
    val score = 70
    val rank = 4
    // > >= < <= == != && || !
    // if (score > 80) println("Great!")
    // else if (score > 60) println("Good!")
    // else println("so so ...")
    val result =
    if (score > 80) "Great!"
    else if (score > 60) "Good!"
    else "so so ..."
    println(result)
  }
}