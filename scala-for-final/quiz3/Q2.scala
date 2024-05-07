package quiz3

object Q2 {
  var score = 0;

  def myReplaceData(l:List[Int], pos:Int, data:Int, count: Int) : List[Int] = {
    if (l.isEmpty) return List()

    if (count == pos) List(data) ++ myReplaceData(l.tail, pos, data, count+1)
    else List(l.head) ++ myReplaceData(l.tail, pos, data, count+1)
  }

  def replaceData(l:List[Int], pos:Int, data:Int):List[Int] = {
    //Assume the list l is never empty
    //pos is assumed to indicate correct position in the list (never go outside possible values)
    myReplaceData(l, pos, data, 0)
  }

  def countInList(l: List[Int], data: Int, count: Int): Int = {
    if (l.isEmpty) return count

    if (l.head == data) countInList(l.tail, data, count + 1)
    else countInList(l.tail, data, count)
  }

  def getAdd(l: List[Int], freqList:List[Int], idx: Int): List[Int] = {
    if (freqList.isEmpty) List()
    else List(countInList(l, idx, 0) + freqList.head) ++ getAdd(l, freqList.tail, idx + 1)
  }

  def updateFreq(l: List[Int], freqList:List[Int]):List[Int] ={
    getAdd(l, freqList, 0)
  }

  def testReplace01(): Unit = {
    val l1 = List(6)
    val result = replaceData(l1,0,2)
    if(result.head == 2) score = score +1;
  }

  def testReplace02(): Unit = {
    val l1 = List(1,2,3,4,5)
    var result = replaceData(l1,1,9)
    result = replaceData(result,3,11)
    result = replaceData(result,4,15)

    if(result(0) == 1 && result(1) == 9 && result(2) ==3) score = score +1;
    if(result(3) == 11 && result(4) == 15 ) score = score +1;
  }

  def testUpdateFreq01():Unit ={
    val freqList = List(0,0,0,0,0)
    var l = List()
    if(updateFreq(l,freqList) == freqList) score = score +1
  }

  def testUpdateFreq02():Unit ={
    val freqList = List(0,0,0,0,0)
    var l = List(4,3,2,3,4,0,3)
    var result = updateFreq(l,freqList)
    if(result(0) == 1) score = score +1;
    if(result(1) == 0) score = score +1;
    if(result(2) == 1) score = score +1;
    if(result(3) == 3) score = score +1;
    if(result(4) == 2) score = score +1;
  }

  def testUpdateFreq03():Unit ={
    val freqList = List(1,0,0,2)
    var l = List(3,3,0,3)
    var result = updateFreq(l,freqList)
    if(result(0) == 2 && result(3) == 5 ) score = score +1;
  }

  def main(args: Array[String]): Unit = {
    testReplace01();
    testReplace02();
    testUpdateFreq01();
    testUpdateFreq02();
    testUpdateFreq03();

     print(score)
  }
}
