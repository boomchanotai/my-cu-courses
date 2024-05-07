object Q1 {
  private def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    if (l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else if (l1.head < l2.head) l1.head :: merge(l1.tail, l2)
    else l2.head :: merge(l1, l2.tail)
  }

  private def topHalf(l: List[Int], len: Int): List[Int] = {
    if (len == 0) Nil
    else l.head :: topHalf(l.tail, len - 1);
  }

  private def bottomHalf(l: List[Int], len: Int): List[Int] = {
    if (len == 0) l
    else bottomHalf(l.tail, len - 1);
  }

  def mergesort(l: List[Int]): List[Int] = {
    if (l.isEmpty) Nil
    else if (l.length == 1) l
    else {
      val top = topHalf(l, l.length / 2);
      val bot = bottomHalf(l, l.length / 2);
      merge(mergesort(top), mergesort(bot))
    }
  }

  def adjustList(start: Int, end: Int, l1: List[Int], count: Int): List[Int] = {
    if (count == end) return List()

    if (count >= start) List(l1.head) ++ adjustList(start, end, l1.tail, count + 1)
    else adjustList(start, end, l1.tail, count + 1)
  }

  def sortTwoLists(l1:List[Int],l2:List[Int]): (List[Int],List[Int]) = {
    val lsort: List[Int] = mergesort(l1 ++ l2)

    val a1 = adjustList(0, l1.length, lsort, 0)
    val a2 = adjustList(l1.length, l1.length + l2.length, lsort, 0)

    (a1,a2)
  }
}
