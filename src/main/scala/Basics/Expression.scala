package Basics

object Expression extends App{

  val x = 3 + 5 //Expression, Compiler automatically infers

  println(x)
  println(2+3*4)

  /**
    * Test for equality
    */

  var aVariable = 3
  aVariable += 3
  println(1 == x)
  println(aVariable)

  // Instruction and Expression
  /**
    * Instruction tell the compiler to do it like doing something
    * Expression that has some value or in hand type
    * Instruction are executed like java and expression are evaluated in scala
    * if in scala is expression
    * loop can returned the side effects
    * Everything in scala is expression except class, object or apply
    * Unit is special type of scala that doesn't returned anything, unit type hold () it means nothing
    * example of side effect: = println, while and reassigning
    * */

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  /*
  * Code Blocks
  * The value of block depend on the value of last expression in the block
  * */

  val aCodeBlocks = {
    val y = 2
    val z = y + 2
    if (z > 2) "hello" else "Else"
  }

  //Basic expression of Scala

  val isEven = x%2 == 0
  val isOdd = !isEven

  // 1. Difference between "hello world" and println("hello world") ?
  // "hello world" is the type of string and println("hello world") has the side effects

  val someValue = {
    2 < 3
  }
  println(s"someValue would be  $someValue")

  val someOtherValue = {
    if(someValue) 239 else 343
    42
  }

  println(s"Answer would be $someOtherValue: 42")


}
