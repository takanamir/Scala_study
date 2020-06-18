// 型パラメータ

// class MyInt {
//   def getThree(i: Int): Unit = println(s"$i $i $i")
// }

class MyData[T] {
  def getThree(i: T): Unit = println(s"$i $i $i")
}

object MyApp {
  def main(args: Array[String]): Unit = {
    // val mi = new MyInt
    // mi.getThree(3)

    val i = new MyData[Int]
    i.getThree(5)
    val s = new MyData[String]
    s.getThree("hello")
  }
}