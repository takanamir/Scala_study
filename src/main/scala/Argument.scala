package main.scala

// 引数
object Argument {
  def sayHi(name: String = "taguchi", age: Int = 23): Unit = {
    println(s"hi! $name ($age)")
  }

  def main(args: Array[String]): Unit = {
    sayHi("bob", 35)    // hi! bob (35)
    sayHi("tom", 55)    // hi! tom (55)
    sayHi()                         // hi! taguchi (23)
    sayHi(age = 18, name = "steve") // hi! steve (18)
  }
}