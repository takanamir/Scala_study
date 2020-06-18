package main.scala

// 部分適用
object Partial {
  def msg(from: String, to: String, text: String) = s"($from -> $to): $text"

  def main(args: Array[String]): Unit = {
    // println(msg("taguchi", "fkoji", "OK!"))
    // println(msg("sugita", "fkoji", "Great!"))
    // println(msg("tanaka", "fkoji", "Good!"))

    val msgToFkoji = msg(_: String, "fkoji", _: String)
    // val msgToFkoji = msg(_: String, _: String, _: String)
    val msgFunc = msg _

    println(msgToFkoji("taguchi", "OK!"))   // (taguchi -> fkoji): OK!
    println(msgToFkoji("sugita", "Great!")) // (sugita -> fkoji): Great!
    println(msgToFkoji("tanaka", "Good!"))  // (tanaka -> fkoji): Good!
  }
}