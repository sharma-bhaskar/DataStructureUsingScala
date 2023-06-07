package Basics

object ValuesVariableTypes extends App{

  // val's are immutable
  val x:Int = 42

  val aString: String = "hello"

  /**
    * Basic Types of Scala
    * Boolean true/false
    * char characters
    * Int
    * Short represent 2 bytes of short type of Int
    * Long represent 8 bytes type of Int
    * Float
    * Double
    * */

  val aBoolean :Boolean = true
  val aChar : Char = 'a'
  val aInt: Int = 23
  val aShort : Short = 2345
  val aLong : Long = 23293948
  val aFloat: Float = 5.4f
  val aDouble : Double = 5.443

  /** Concept of variable
    *  variable can be reassign
    *  mutable
    *  compiler automatically infer types when omitted
    * */
  var aVariableInt: Int = 34

  aVariableInt = 45 //Side effect represent something on console and represent something on code

  println(x)

}
