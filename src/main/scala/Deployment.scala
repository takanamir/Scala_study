package main.scala

object Deployment {
  def main(args: Array[String]): Unit = {
    val name = "taguchi"
    val score = 80
    val height = 158.3

    println(s"name: $name, score: $score, height: $height")
    println(s"name: $name, score: ${score + 10}, height: $height")

    println(f"name: $name%s, score: $score%d, height: $height%f")
    println(f"name: $name%10s, score: $score%10d, height: $height%10f")
    println(f"name: $name%10s, score: $score%-10d, height: $height%10f")
    println(f"name: $name%10s, score: $score%-10d, height: $height%10.2f")
  }
}