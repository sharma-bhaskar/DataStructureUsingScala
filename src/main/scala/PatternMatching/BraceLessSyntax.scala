package PatternMatching

object BraceLessSyntax {

  val ifExpression: String = if (2 > 3) "bigger" else "Smaller"

  //scala 3

  val aScala3If: String =
    if 2 > 3 then
      "bigger"
    else
      "smaller"

  // for compreshension v 3

  val aCompres =
    for
      n <- List(1,2,3,4)
      s <- List("black","white")
    yield s"$n$s"


  def main(args: Array[String]): Unit = {
    println(aScala3If)
    println(aCompres)
  }


}
