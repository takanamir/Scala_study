package main.scala

object CurryFunction {
  def main(args: Array[String]): Unit = {
    // 関数のカリー化
    val multFunc = (a: Int, b: Int) => a * b
    val multFuncCurried = (a: Int) => ((b: Int) => a * b)

    // println(multFunc(3, 5))
    // println(multFuncCurried(3)(5))

    val double = multFuncCurried(2)
    val tripple = multFuncCurried(3)

    println(double(5)) // 10
    println(tripple(5)) // 15
  }
}