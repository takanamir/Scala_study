package main.scala

// Class
//   user: User
//   i: Int
// - 変数 / フィールド
// - メソッド
class User {
  val name = "my name"

  def sayHi() = println("hi!")
}

object ClassSample {
  def main(args: Array[String]): Unit = {
    // val user: User = new User
    val user = new User
    println(user.name) // my name
    user.sayHi()       // hi!
  }
}