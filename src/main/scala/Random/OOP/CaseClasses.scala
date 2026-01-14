package Random.OOP

object CaseClasses extends App {

  /*
  * equal, hashcode and toString
  * */

  case class Person(name: String, age: Int)

  //1. class parameter promoted to fields
  val jim = Person("Jim", 23)
  println(jim.name)

  //2 sensible to String
  println(jim)

  //3 equal and hashcode implemented

  val jim2 = Person("Jim", 23)
  println(jim == jim2)

  //4 handy copy method
  val jim3 = jim.copy(age = 34)

  //5 case classes have companion object
  //6 case classes are serializble
  //7. CCs have extractor patterns = Case classes can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name:String = "The UK of GB and NI"
  }


}
