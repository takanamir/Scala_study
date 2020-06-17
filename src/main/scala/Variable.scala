package main.scala

object Variable {
  def main(args: Array[String]): Unit = {
    // 変数
    // - val: 値の再代入ができない immutable
    // - var: 値の再代入ができる mutable

//    val msg1: String = "Hello World"
    val msg1 = "Hello World1" // 型推論
    println(msg1)

    var msg2 = "Hello World2" // 型推論
    msg2 = "Hello World Again?"
    println(msg2)
  }
}