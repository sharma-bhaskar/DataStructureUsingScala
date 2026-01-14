package Random.FunctionalProgramming

object AnonymousFunction extends App{

  //Working with function is similar like to oop way

  val doubler : Int => Int = new Function[Int,Int]{
    override def apply(v1:Int): Int = v1*2
  }

  println(doubler(2))

  //new way function

  val doubler2  = (x :Int) =>  x * 2 //anonymous function
  println(doubler2(2))

  //multiple parameter in lambda

  val adder = (x : Int) => (y:Int) => x + y
  println(adder(2)(3))

  val stringToInt = {(str:String) =>
    str.toInt
  }
  println(stringToInt("2"))


}
