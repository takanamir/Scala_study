package main.scala

object ForLoop {
  def main(args: Array[String]): Unit = {
    // for
    // for (ジェネレータ) 処理
    // for (変数 <- データの集合) 処理
    // 0 to 3, 0 until 4
    for (i <- 0 to 3) print(i + " ")
    println("")
    for (i <- 0 to 3; j <- 0 to 3) print(s"$i, $j" + " ")
    println("")
    for (i <- 0 to 3; j <- 0 to 3 if i != j) print(s"$i, $j" + " ")
    println("")

    val result = for (i <- 0 to 3; j <- 0 to 3 if i != j) yield s"$i, $j"
    for (el <- result) print(el + " ")
  }
}