package OOP

object AnanymousClasses extends App{

  abstract class Animal {
    def eat : Unit
  }

  //Anonymous Class
  val funnyAnimal = new Animal {
    override def eat: Unit = println("haahhahahahahha")
  }

  println(funnyAnimal)

  class Person(name:String) {
    def sayHi() :  Unit = println(s"Hi My $name is Xyz")
  }

  val jimm = new Person("Jimmy")

}
