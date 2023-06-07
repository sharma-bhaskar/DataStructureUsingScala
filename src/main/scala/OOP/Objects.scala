package OOP


/**
  * Object has the static like functionality
  * Scala object is a singleton instance
  * */
object Objects extends App {

  /**
    * Singleton return only single instance of that object
    * */
  object Person { // object is only type and its only instance
    val N_EYES = 2

    //factory method

    def apply(person1:Person, person2: Person) = new Person("Bobby")
  }

  /**
    *
    * */
  class Person(val name:String) {
    //instant level functionality and companion object
  }

  println(Person.N_EYES)

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val bobby = Person(mary,john)

  //Scala Application


}
