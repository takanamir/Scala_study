package main.scala

// 関数 Input -> Output
object FunctionalObject {
  // method
  def mult(a: Int, b: Int) = a * b

  // 関数オブジェクト
  // 引数 => 処理
  // val multFunc: (Int, Int) => Int = (a: Int, b: Int) => a * b
  // val multFunc = (a: Int, b: Int) => a * b
  val multFunc = (_: Int) * (_: Int)

  def main(args: Array[String]): Unit = {
    // println(multFunc(3, 5)) // 15
    println(multFunc(2, 4)) // 8
  }
}