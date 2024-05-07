
object TestQ1 {
  def main(args: Array[String]): Unit = {
    val l1= List(9,1,6,4,3)
    val l2 = List(0,8,7,2,5)
    println(Q1.sortTwoLists(l1,l2) == (List(0,1,2,3,4),List(5,6,7,8,9)))

    val l3 = List()
    val l4 = List(5,2,8,1,3,6)
    println(Q1.sortTwoLists(l3,l4) == (List(),List(1,2,3,5,6,8)))

    val l5 = List(5,2,4)
    val l6 = List(7,8,9,1,2,3,5)
    println(Q1.sortTwoLists(l5,l6) == (List(1,2,2),List(3,4,5,5,7,8,9)))

    val l7 = List(7, 8, 7, 1, 4, 3, 5, 2)
    val l8 = List(5, 1, 8, 6)
    println(Q1.sortTwoLists(l7, l8) == (List(1,1,2,3,4,5,5,6), List(7,7,8,8)))

  }
}
