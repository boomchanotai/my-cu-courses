object Question04 {
  def palindrome(l : List[Any]): Boolean = {
    var reverse: List[Any] = myReverse(l)
    palin(l, reverse)
  }

  def palin(l : List[Any], l_rev : List[Any]) : Boolean = {
    if (l.isEmpty || l_rev.isEmpty) return true

    if (l.head == l_rev.head) palin(l.tail, l_rev.tail)
    else false
  }

  def myReverse(l : List[Any]) : List[Any] = {
    if (l.isEmpty) List()
    else myReverse(l.tail) ++ List(l.head)
  }

  def main(args: Array[String]): Unit = {
//    println(palindrome(List(1, 2, 1)))
//    println(palindrome(List(1, 2, 1, 1)))
//
    println(List("w", "K") == List("K", "w")) //false
    println(palindrome("WORD".toList)) // false
    println(palindrome("DOOD".toList)) // true
    println(palindrome("LICK".toList)) // false
    println(palindrome("BALLSSLLAB".toList)) // true
    println(palindrome("BALLsSLLAB".toList)) // false
  }

}
