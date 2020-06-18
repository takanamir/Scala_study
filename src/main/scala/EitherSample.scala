package main.scala

object OptionSample {
  def main(args: Array[String]): Unit = {
    // Error
    // Option：値が存在したときには Some、そして値が存在しないときには None を返してくれる型
    // - Some
    // - None

    val scores = Map("taguchi" -> 50, "fkoji" -> 80)
    // println(scores("dotinstall")) // getOrElse, contains

    // scores.get("dotinstall") match {
    scores.get("fkoji") match {
      case Some(v) => println(v)
      case None => println("key not found")
    }
  }
}