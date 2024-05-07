object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] = {
    insert(x,l,0)
  }

  def insert(x: Int, l:List[Int], acc: Int): List[Int] = {
    if (l.isEmpty) return List(x)
    if (l.head >= x && acc == 0) return x :: l
    l.head :: insert(x, l.tail, acc)
  }

  def main(args: Array[String]): Unit = {
    println(insertInOrder(113, List(2, 3, 6, 10, 12)))
  }
}
