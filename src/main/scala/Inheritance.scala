package main.scala

class User2(val name: String) {
  def sayHi() = println("hi! " + name)
}

class AdminUser(name: String, val age: Int) extends User2(name) {
  def sayHello() = println("hello! " + name + "(" + age + ")")
  override def sayHi() = println("[admin] hi! " + name)
}

object Inheritance {
  def main(args: Array[String]): Unit = {
    val bob = new AdminUser("bob", 23)
    println(bob.name) // bob
    println(bob.age)  // 23
    bob.sayHi()       // [admin] hi! bob
    bob.sayHello()    // hello! bob(23)
  }
}