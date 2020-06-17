package main.scala

object Method {
  // method

  def sayHello(): Unit = {
    println("hello!") // hello!
  }

  def sayHi(): String = {
    // 返り値
    // return "hi!"
    "hi!"
  }

  def main(args: Array[String]): Unit = {
    sayHello() // hello!
    println(sayHi()) // "hi!"
  }
}