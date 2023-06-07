package OOP

object Inheritance extends App {

  //Single class inheritance in scala

  /**
    * private is access only this class
    * protected modifier allow in the sub class variable
    * public
    * */

  sealed class Animal {
    def eat = println("Eat")
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat

  //constructors

  class Person(name:String, age:Int){
    def this(name:String) = this(name,0)
  }
  class Adult(name:String,age:Int,idCard:String) extends Person(name)

  //overriding

  class Dog extends Animal{
    override def eat: Unit = println("dog eat")
  }

  val dog = new Dog
  dog.eat

  // super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files


}
