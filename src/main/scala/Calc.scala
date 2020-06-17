package main.scala

object Calc {
  def main(args: Array[String]): Unit = {
    // 数値
    // + - * / %
    val x = 10
    println(x / 3) // 3
    println(x / 3.0) // 3.3333...
    println(x % 3) // 1

    var y = 5
    // y = y + 10
    y += 10 // 15

    // 文字列
    val s = "hello "
    println(s + "world")

    // 論理値
    // and or not
    // && || !
    val flag = true
    println(!flag) // false
  }
}