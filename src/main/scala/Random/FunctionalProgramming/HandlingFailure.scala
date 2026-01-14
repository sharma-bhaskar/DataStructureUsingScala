package Random.FunctionalProgramming

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App {

  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Super Failure"))

  println(aSuccess)
  println(aFailure)

  def unSafeMethod = throw new RuntimeException("UnsafeMethod")


  //Try to catch the exception while caught
  val potentialFailure = Try(unSafeMethod)

  println(potentialFailure)

  //syntax
  //sugar

  val anotherFailure = Try{

  }

  println(potentialFailure.isSuccess)

  //orElse

  def backMethod():String = "A valid reason"

  val fallBackTry = Try(unSafeMethod).orElse(Try(backMethod()))

  println(fallBackTry.get)

  val betterUnsafeMethod: Try[String] = Failure(new RuntimeException("Unsafe Method"))
  val betterSafeMethod : Try[String] = Success("A safe method")

  val trySafeMethod = betterUnsafeMethod orElse betterSafeMethod

  println(trySafeMethod.get)




}
