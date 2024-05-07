package quiz3

object Q1 {
 var score = 0;

  def tailRecur(f: Int => Int, g: Int => Int, l: List[Int], acc: List[Int]): List[Int] = {
    if (l.isEmpty) return acc

    tailRecur(f, g, l.tail, acc ++ List(f(g(l.head))))
  }
  
 def fgList(f: Int=>Int, g: Int=>Int, l: List[Int]): List[Int] = {
   tailRecur(f, g, l, List())
 }

  def f1(a:Int):Int = a*a
  def f2(a:Int):Int = 2*a -1
  def f3(a:Int):Int = a + 10

  def testEmptyList(): Unit = {
    val l:List[Int] = List()
    if(fgList(f1,f2,l) == List()) score += 1;
    if(fgList(f2,f3,l) == List()) score += 1;
  }

  def testSingleDataList(): Unit = {
    val l:List[Int] = List(3)
    if(fgList(f1,f2,l) == List(25)) score += 1;
    if(fgList(f2,f3,l) == List(25)) score += 1;
  }

  def testShortList(): Unit = {
    val l:List[Int] = List(1,4)
    if(fgList(f1,f2,l) == List(1,49)) score += 1;
    if(fgList(f2,f3,l) == List(21,27)) score += 1;

  }

  def testGenericList(): Unit = {
    val l:List[Int] = List(5,2,1,9,3)
    if(fgList(f1,f2,l) == List(81,9,1,289,25)) score += 1;
    if(fgList(f2,f3,l) == List(29,23,21,37,25)) score += 1;
    if(fgList(f3,f1,l) == List(35,14,11,91,19)) score += 1;
    if(fgList(f1,f3,l) == List(225,144,121,361,169)) score += 1;
  }

  def main(args: Array[String]): Unit = {
    testEmptyList();
    testSingleDataList();
    testShortList();
    testGenericList();
    print(score)

  }


}
