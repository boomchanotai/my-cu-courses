object Question10 {

  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    cal(f1, f2, list, 0, 0)
  }

  def cal(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int], level: Int, acc: Int): Int = {
    if (list.isEmpty) return acc
    if (level % 2 != 0) cal(f1, f2, list.tail, level + 1, f1(list.head, acc))
    else cal(f1, f2, list.tail, level + 1, f2(list.head, acc))
  }

  def main(args: Array[String]): Unit = {
    println(alternate(_+_, _-_,List()))
    println(alternate(_+_, _-_, List(55)))
    println(alternate(_+_, _-_, List(1, 2)))
    println(alternate(_+_, _-_, List(1, 2, 3)))
    println(alternate(_+_, _-_, List(1, 2, 3, 4)))
  }

}
