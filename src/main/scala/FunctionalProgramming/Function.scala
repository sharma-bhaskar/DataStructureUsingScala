package FunctionalProgramming

object Function extends App {

  // use function as first class element

  val doubler = new MyFunction[Int,Int] {
    override def apply(element: Int): Int = element*2
  }

  println(doubler(2))

  //Scala support function type till 22 function
  val stringToIntConverter = new Function[String,Int]{
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToIntConverter("3"))
  val adder = new Function2[Int,Int,Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  // Function types Function2[A, B, R] === (A,B) => R

  // ALL SCALA FUNCTIONS ARE OBJECTS

  /*
   1.  a function which takes 2 strings and concatenates them
   2.  transform the MyPredicate and MyTransformer into function types
   3.  define a function which takes an int and returns another function which takes an int and returns an int
       - what's the type of this function
       - how to do it
  */

  val stringConcatenation :(String,String) => String =  new Function2[String,String,String]{
    override def apply(v1: String, v2: String): String = v1.concat(v2)
  }

  println(stringConcatenation("Hello","world"))

  val functionTakeInt : Int => Int => Int = new Function1[Int,Function1[Int,Int]]{
    override def apply(v1: Int): Function1[Int,Int] = new Function1[Int,Int]{
      override def apply(v2: Int): Int = v1 + v2
    }
  }

  println(functionTakeInt(10)(220)) //Curried Function 


}

trait MyFunction[A,B] {
  def apply(a: A) : B
}
