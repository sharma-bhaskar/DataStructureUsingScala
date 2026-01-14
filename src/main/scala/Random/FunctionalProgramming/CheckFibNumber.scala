package Random.FunctionalProgramming

import scala.math.{pow, round, sqrt}

object CheckFibNumber extends App {

  val n = 60

  val nth = 7

//  val check = findMinFibonacciNumbers(7)
//  println(check)

  var a : BigInt = 0
  var b :  BigInt = 1
  var c :  BigInt = 0

  println(optFib(50))

  def optFib(n : Int) : BigInt = {
    for (i <- 1 until n) {
      c = a + b
      a = b
      b = c
    }
    b
  }


  val nthNum = nthFibNumber(50)

  println(nthNum)

  def nthFibNumber(n: BigInt): BigInt = {
    if (n <= 1) {
       n
    } else {
      nthFibNumber(n - 1) + nthFibNumber(n - 2)
    }

  }



  def findMinFibonacciNumbers(k: Int): Int = {
    if (k < 2) {
      return k
    }
    var a = 1
    var b = 1
    while (b <= k) {
      b += a
      a = b - a
    }
    1 + findMinFibonacciNumbers(k - a)
  }


  def checkNumber(n: Int): Double = {
    round(pow(0.5 + 0.5 * sqrt(5.0), n) -
      pow(0.5 - 0.5 * sqrt(5.0), n)) /
      sqrt(5.0)
  }

  def solution(n: Int): Boolean = {
    isPerfectSquare(5 * n * n - 4) || isPerfectSquare(5 * n * n + 4)
  }

  def isPerfectSquare(n: Int): Boolean = {
    val res = math.sqrt(n)
    println(res * res)
    println(n)
    res * res == n.toLong
  }

}
