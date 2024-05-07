object Question06 {
  
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    filter(f, list, List())
  }

  def filter(f: Int => Boolean, list: List[Int], acc: List[Int]) : List[Int] = {
    if (list.isEmpty) return acc
    if (f(list.head)) filter(f, list.tail, acc ++ List(list.head))
    else filter(f, list.tail, acc)
  }

  def isLessThan3(x: Int) = x < 3

  def main(args: Array[String]): Unit = {
    println(myFilter(x => x%2==0)(List(1,2,3,4,5)))
    println(myFilter(isLessThan3)(List(1,2,3,4,5)))
  }

}
