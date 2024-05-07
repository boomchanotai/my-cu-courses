object Question01 {
  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] = {
    insert(x, pos, l, 1)
  }

  def insert(x: Any, pos: Int, l:List[Any], level: Int): List[Any] = {
    if (pos == 0) return x :: l
    if (l.isEmpty) return List()
    if (pos == level) l.head :: x :: insert(x, pos, l.tail, level + 2)
    else l.head :: insert(x, pos, l.tail, level + 1)
  }

  def main(args: Array[String]): Unit = {
    println(insertAtPosition(22, 1, List(1,2,3,4,5)))
  }
}
