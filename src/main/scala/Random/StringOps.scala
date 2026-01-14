package Random

object StringOps extends App {

  val str:String = "Hello I am learning scala"


  //Java utility
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase)
  println(str.length)

  //Scala utility

  val aNumberString = "34"

  val aString = aNumberString.toInt


  /**
    * Prepending "+:"
    * Appending  ":+"
    * */
  println('a' +: aNumberString )

  println(aNumberString :+ 'a')

  println(str.reverse)
  println(str.take(2))

  // String interPolater
  // f Interpolaters

  val name = "David"
  val age = 23
  val greeting = s"Hello, my name is $name and age is $age"
  val anotherGreetingExp = s"Hello, my name is $name and I am turing ${age +1} years old"

  println(anotherGreetingExp)

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burger per min"
  println(myth)

  // raw interpolaters ignore escape characters in scala
  println(raw" this is a \n new line")

  val escaped = "this is a \n new line"
  println(raw"$escaped")




}
