package OOP

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person) = s"${this.name} hangout with ${person.name}"

    def +(person: Person) = s"${this.name} hangout with ${person.name}"

    def +(nickName: String): Person = new Person(s"$name ($nickName)", favoriteMovie)

    def uniary_! : String = s"$name, what the heck"

    def uniary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and my favorite movie $favoriteMovie"

    def apply(n: Int): String = s"$name watched Inception $n time"

    def learns(thing: String) = s"$name learn $thing"

    def learnScala: String = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary likes "Inception")
  val tom = new Person("Tom", "ABCD")
  println(mary hangOutWith tom)
  println(mary.+(tom))
  //All operators in scala is methods

  //Prefix notation
  // unix operator works only for +, -, ~, !

  val x = -1
  val y = 1.unary_-
  println(y)
  println(mary.isAlive)
  println(mary isAlive)

  //apply method when you call object as a function than compiler look for apply method
  println(mary.apply())
  println(mary())


  /*
    1.  Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"
    2.  Add an age to the Person class
        Add a unary + operator => new person with the age + 1
        +mary => mary with the age incrementer
    3.  Add a "learns" method in the Person class => "Mary learns Scala"
        Add a learnsScala method, calls learns method with "Scala".
        Use it in postfix notation.
    4.  Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"
   */

  println((mary + "the rockstar").apply())
  println(+mary.age)
  println(mary learnScala)
  println(mary.apply(2))

}

