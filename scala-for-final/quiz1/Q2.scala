

object Q2 {
  def indivOp(l1:List[Int], l2: List[Int], l3:List[(Int,Int) => Int]): List[Int] = {
//    if(l1.isEmpty) return List()
//
//    var f = l3.head
//    return f(l1.head,l2.head) :: indivOp(l1.tail,l2.tail,l3.tail)
    return indivOp(l1, l2, l3, List())
  }

  def indivOp(l1:List[Int], l2: List[Int], l3:List[(Int,Int) => Int], acc:List[Int]): List[Int] = {
    if (l1.isEmpty) return acc

    var f = l3.head
    return indivOp(l1.tail, l2.tail, l3.tail, acc ++ List(f(l1.head, l2.head)))
  }

}
