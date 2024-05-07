
object TestQ2 {
  def add(x:Int,y:Int):Int ={
    return x+y
  }

  def subtract(x: Int, y: Int): Int = {
    return x - y
  }

  def mul(x:Int,y:Int):Int ={
    return x*y
  }



  def main(args: Array[String]): Unit = {
    val l1 = List(9, 3, 6)
    val l2 = List(2, 8, 7)
    val l3 = List(add(_,_),mul(_,_),subtract(_,_));
    println(Q2.indivOp(l1,l2,l3) == List(11,24,-1))

    val l4 = List(9, 3, 6, 5, 2 , 1 )
    val l5 = List(2, 8, 7, 3, 5 , 4 )
    val l6 = List(mul(_, _), add(_, _), add(_, _),subtract(_,_),mul(_,_),subtract(_,_));
    println(Q2.indivOp(l4,l5,l6) == List(18,11,13,2,10,-3))

    val l7 = List()
    val l8 = List()
    val l9 = List();
    println(Q2.indivOp(l7, l8, l9) == List())


  }
}
