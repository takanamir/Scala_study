package main.scala

// Class
//   user0: User0
//   i: Int
// - 変数 / フィールド
// - メソッド
class User0 {
  val name = "my name"

  def sayHi() = println("hi!")
}

object ClassSample {
  def main(args: Array[String]): Unit = {
    // val user0: User = new User0
    val user0 = new User0
    println(user0.name) // my name
    user0.sayHi()       // hi!
  }
}