package Basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Functions extends App {


  /* Everything in scala calling a function is expression
  *  function has type infers
  * */
  def aFunction(aString: String, aInt: Int): String = {
    aString + " " + aInt
  }

  def aParameterLessFunction(): Int = 43

  println(aParameterLessFunction())

  println(aFunction("Hello", 3))


  /**
    * Concat a string number of times using int value
    * */
  def aRepeatedFunction(aString: String, aInt: Int): String = {
    if (aInt == 1) aString
    else aString + aRepeatedFunction(aString, aInt - 1)
  }

  println(aRepeatedFunction("Hello", 3))
  // Normal programming langauge use loop but in scala we use recursive function

  def aFunction(n: Int): Int = {
    //Auxuillary function
    def aBigFunction(a: Int, b: Int): Int = a + b

    aBigFunction(n, n - 1)
  }

  println("Auxuillary function" + aFunction(5))

  /*
   Exercises:
   1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
   2.  Factorial function 1 * 2 * 3 * .. * n
   3.  A Fibonacci function
       f(1) = 1
       f(2) = 1
       f(n) = f(n - 1) + f(n - 2)
   4.  Tests if a number is prime.
  */

  def greetingFunction(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old"

  println(greetingFunction("Alex", 34))

  def factorialFunction(n: BigInt): BigInt = {
    if (n <= 0) 1
    else n * factorialFunction(n - 1)
  }

  def fibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else fibonacciFunction(n - 1) + fibonacciFunction(n - 2)
  }

  def isPrimeNumber(n: Int): Boolean = {
    @tailrec
    def isPrimeUtil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUtil(t - 1)

    isPrimeUtil(n / 2)
  }



  /**
    * Sum of list of numbers
    * */
  def sumOfList(listOfNumber: List[Int]): Int = {
    @tailrec
    def sumWithAccumulator(listOfN: List[Int], accumulator: Int = 0): Int = listOfN match
      case Nil => accumulator
      case x :: xs => sumWithAccumulator(xs, accumulator + x)

    sumWithAccumulator(listOfNumber)
  }

  println("Sum of the list of number "+sumOfList(List(1,2,3,4)))

  println("Fibonacci " + fibonacciFunction(8))

  println("Factorial using recursion " + factorialFunction(45))

  println("  " + isPrimeNumber(37))


}
