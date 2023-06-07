package FunctionalProgramming

import scala.annotation.tailrec

object HigherOrderFunctionAndCurries extends App {

  //Higher Order function is take another function example map, flatmap and filters

  // function that applies a function n times over a value x
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x))) = nTimes(f, 2, f(x)) = f(f(f(x)))
  // nTimes(f, n, x) = f(f(...f(x))) = nTimes(f, n-1, f(x))

  @tailrec
  def nTimes(f : Int => Int, n:Int, x :Int) :Int ={
    if(n <= 0) x
    else nTimes(f,n-1,f(x))
  }

  val plusOne = (x :Int) =>  x + 1

  println("HigherOrderFunction "+nTimes(plusOne,20,3))

  //Curried Function

  val superadder = (x:Int) => (y:Int)  => x + y



}
