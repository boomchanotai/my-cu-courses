package quiz2

object Q2 {

  def checkInList(l: List[Any], data: Any) : Boolean = {
    if (l.isEmpty) return false

    if (l.head == data) true
    else checkInList(l.tail, data)
  }

  def tailDif(l1: List[Any], l2: List[Any], acc: List[Any]): List[Any] = {
    if (l1.isEmpty) return acc

    if (!checkInList(l2, l1.head)) tailDif(l1.tail, l2, acc ++ List(l1.head))
    else tailDif(l1.tail, l2, acc)
  }
 
  def difference(l1: List[Any], l2: List[Any]): List[Any] = {
    tailDif(l1,l2,List())
  }

  def test01(): Unit = {
    var score = 0;
    val l1 = List(6, 2, 4, 3, 1, 7)
    val l2 = List(10, 2, 6, 3, 8, 4)
    val l3 = List("a", "b", "c")
    val l4 = List("c", "d", "b", "e")

    if (difference(List(), l2) == List()) score += 1;
    if (difference(l1, List()) == List(6, 2, 4, 3, 1, 7)) score += 1;
    if (difference(l1, l2) == List(1, 7)) score += 2
    if (difference(l3, l4) == List("a")) score += 2
    if (difference(l2, l1) == List(10, 8)) score += 2
    if (difference(l4, l3) == List("d", "e")) score += 2

    println("Score = " + score)

  }

  def main(args: Array[String]): Unit = {
    test01();
  }
}
