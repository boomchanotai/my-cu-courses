object Question03 {
  def subList(l1: List[Any], l2:List[Any]): Boolean = {
    if (l1.isEmpty) return true
    if (!check(l2, l1.head)) return false
    subList(l1.tail, l2)
  }

  def check(l: List[Any], acc: Any): Boolean = {
    if (l.isEmpty) return false
    if (l.head == acc) return true
    check(l.tail, acc)
  }

  def main(args: Array[String]): Unit = {
    println(subList(List(1, 2, 3, 4, 6), List(1, 2, 3, 4, 5)))
  }
}
