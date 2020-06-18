package main.scala

// Set
// List と違って順序を保持しない、そして重複を許さないという特徴がある
object SetSample {
  def main(args: Array[String]): Unit = {
     val answers = Set(5, 3, 8, 5)
     println(answers)             // 5, 3, 8
     println(answers.contains(3)) // true
     println(answers(3))          // true

    val set1 = Set(1, 3, 5, 8)
    val set2 = Set(3, 5, 8, 9)

    println(set1 & set2)  // Set(3, 5, 8) ← intersect(積集合)
    println(set1 | set2)  // HashSet(5, 1, 9, 3, 8) ← union(和集合)
    println(set1 &~ set2) // Set(1) ← diff(差集合)
  }
}