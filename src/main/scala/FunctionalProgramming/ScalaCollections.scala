package FunctionalProgramming

object ScalaCollections extends App {

  /**
    * Scala has two types of collection
    * Muttable collection and Immutable collection
    * */


  //Seq
  val aSeq = Seq(1,2,3,4)
  println(aSeq)
  println(aSeq.reverse)
  println(aSeq(2))
  println(aSeq ++ Seq(7,4))
  println(aSeq.sorted)

  val aRange : Seq[Int]  = 1 until 10
  aRange.foreach(println)

  //List
  val aList = List(1,2,3,4)
  val prepended = 42 :: aList
  println(prepended)

  val infixOpr = 89 +: aList
  println(infixOpr)

  //curried function
  val appleFive = List.fill(5)("Apple")
  println(appleFive)
  println(aList.mkString("-"))

  //Arrays

  val numbers = Array(1,2,3,4)
  val threeDimArray = new Array[String](3)

  println(threeDimArray.mkString)

  numbers(0) = 2
  println(numbers.mkString(","))

}
