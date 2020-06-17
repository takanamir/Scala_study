package main.scala

object DataType {
  def main(args: Array[String]): Unit = {
    // 整数 Byte Short Int Long
    val i = 5
    val l = 5555555555L
    println(i)
    println(l)

    // 浮動小数点数 Float Double
    val d = 32535.5
    val f = 234.34F
    println(d)
    println(f)

    // 文字 Char
    val c = 'a'
    println(c)

    // 文字列 String
    val s = "Hello"
    // 特殊文字 \n: 改行、\t: タブ
    println(s)

    // 論理値 Boolean
    val flag = true // false
    println(flag)

    val msg = "Hello W\norl\td"
    println(msg)
  }
}
