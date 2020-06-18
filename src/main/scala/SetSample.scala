package main.scala

// List
object ListSample {
  def main(args: Array[String]): Unit = {
    // Collection
    // - Seq: List 順番をもつデータ集合
    // - Set 順番をもたず、要素は重複しないというデータ集合
    // - Map キーと値でデータを管理していく集合

    // val scores = List(200, 300, 400)
    // val scores = List[Int](200, 300, 400) // 型を指定したい場合
    // 型推論が効くので、このくらいの例だったら型宣言を省略してもOK

    // val scores = Nil
    // val scores = 200 :: Nil
    val scores = 200 :: 300 :: 400 :: Nil

    println(scores.length)  // 3 ← 要素の個数
    println(scores.isEmpty) // false ← 空かどうかを調べる
    println(scores.head)    // 200 ← 先頭の要素
    println(scores.tail)    // List(300, 400) ← 先頭以外の要素
    println(scores(1))      // 300 ← 1番目の値
  }
}