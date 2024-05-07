object Question05 {
  def merge(lis1: List[Int], lis2: List[Int]) : List[Int] = {
    if (lis1.isEmpty)  return lis2
    if (lis2.isEmpty) return lis1
    if (lis1.head < lis2.head) return lis1.head :: merge(lis1.tail, lis2)
    lis2.head :: merge(lis1, lis2.tail)
  }

  def left(l:List[Int] , len: Int) : List[Int] = {
    if (len == 0) return Nil
    l.head :: left(l.tail, len-1)
  }

  def right(l:List[Int] , len: Int) : List[Int] = {
    if (len == 0) return l
    right(l.tail , len-1)
  }

  def mergesort(l: List[Int]):List[Int] ={
    if (l.isEmpty) Nil
    else if (l.length == 1) l
    else {
      val top = left(l , l.length / 2);
      val bot = right(l , l.length / 2);
      merge(mergesort(top), mergesort(bot))
    }
  }

  def main(args: Array[String]): Unit = {
    println(mergesort(List(1,3,4,5,2)));
  }
}
