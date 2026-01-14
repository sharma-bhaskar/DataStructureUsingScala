package Random.PatternMatching

import scala.util.Random

object PatternMatching extends App {

  val random = new Random

  val x = random.nextInt(5)

  val description = x match {
    case 1 => "case 1"
    case 2 => "case 2"
    case 3 => "case 3"
    case 4 => "case 4"
    case _ => "wildcard"
  }

  println(description)

  //decompose values case classes

  case class Person(name:String,age:Int)

  val bob = Person("Bob",33)

  val greeting = bob match {
    case Person(name,age) if age < 21 => s"Hi my name is $name and year old $age"
    case Person(name,age) => s"Hi my name is $name and year old $age"
    case _ => "I don't know"
  }

  println(greeting)

  /*
    1. cases are matched in order
    2. what if no cases match? MatchError
    3. type of the PM expressoion? unified type of all the types in all the cases
    4. PM works really well with case classes*
   */

  // PM on sealed hierarchies
  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal: Animal = Dog("Terra Nova")
  animal match {
    case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
  }

}
