package main.scala

// class User1(_name: String) {
class User1(val name: String) {
  // val name = _name
  // def sayHi() = println("hi! " + this.name)
  def sayHi() = println("hi! " + name)
}

object ConstructorArgument {
  def main(args: Array[String]): Unit = {
    val tom = new User1("tom") // インスタンス
    println(tom.name)
    tom.sayHi()
  }
}