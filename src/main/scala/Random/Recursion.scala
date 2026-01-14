package Random

import scala.annotation.tailrec
//import scala.jdk.Accumulator

object Recursion extends App {

  //Factorial
  //StackOverflow happen when number block is to block
  def factorialOfNumber(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialOfNumber(n - 1)
  }


  // Tail recursion factorial
  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    /// auxuillary function allow scala to preserve same stack frame not to create one its mostly like in tail recursion
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
      //Scala doesn't to save intermediate result to evaulate later, in Tail Recursion
      // one stack frame replace with some other recrusive
      //Tail Recusion is use to recursive call as the Last expression
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(5))

  /*
    Exercises:
    1.  Concatenate a string n times
    2.  IsPrime function tail recursive
    3.  Fibonacci function, tail recursive.
   */


  //recursive string concat
  def concateString(aString: String, n: Int): String = {
    @tailrec
    def stringHelper(str: String, accumulator: String, x: Int): String = {
      if (x <= 1) str
      else stringHelper(str, str + accumulator, x - 1)
    }

    stringHelper(aString, "", n)
  }

  //tail recursive

  /**
    * @param string
    * @param accumulator
    * @param n
    * @return
    */
  @tailrec
  def concateString(string: String, accumulator: String, n: Int): String = {
    if (n <= 0) accumulator
    else concateString(string, string + accumulator, n - 1)
  }

  println(concateString("Hello", 3))

  // 2.  IsPrime function tail recursive

  def isPrime(n: Int): Boolean = {
    /**
      * @param t
      * @param isStillPrime
      * @return
      */
    @tailrec
    def helperPrime(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else helperPrime(t-1,n%t != 0 && isStillPrime)
    }
    helperPrime(n/2,true)
  }
  println(isPrime(2003))


 // 3.  Fibonacci function, tail recursive.

  /**
    * @param n
    * @return
    */
  def fibonacci(n: Int): Int = {
    /**
      * @param i
      * @param last
      * @param nextToLast
      * @return
      */
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8)) // 1 1 2 3 5 8 13, 21



}
