object Question07 {
  
  def myMap(f:Int => Int) (list : List[Int]) :List[Int] = {
    tmap(f, list, List())
  }

  def tmap(f: Int => Int, list : List[Int], acc : List[Int]):List[Int] = {
    if (list.isEmpty) acc
    else tmap(f, list.tail, acc ++ List(f(list.head)))
  }

  def square(x: Int): Int = x*x

  def main(args: Array[String]): Unit = {
    println(myMap(x => x*2)(List(1,2,3,4,5)))
    println(myMap(square)(List(1,2,3,4,5)))
  }


}
