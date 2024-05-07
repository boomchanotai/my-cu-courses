object Question09 {

  //val tape = List('C','H','A','R')

  def turingStep(f: Char => Char, tape: List[Char], n: Int): List[Char] = {
    if (tape.isEmpty) return Nil
    if (n == 0) return tape
    f(tape.head) :: turingStep(f, tape.tail, n - 1)
  }

  def main(args: Array[String]): Unit = {
    def f1(c: Char): Char = c.toLower
    val tape = List('C', 'H', 'A', 'R')
    println(turingStep(f1,tape,2))
  }

}
