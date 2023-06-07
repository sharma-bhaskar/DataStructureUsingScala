package OOP

object AbstractDataType extends App {

  //Classes field unimplemented is called abstract and abstract class cannot be instantiated

  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  /**
    *
    */
  class Dog extends Animal {
    val creatureType: String = "Dog"

    def eat: Unit = println("eat eat")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBloded
  /**
    *  // traits vs abstract classes
  // 1 - traits do not have constructor parameters (scala 3 it is possible)
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"
    */
  class Crocodile extends Animal with Carnivore with ColdBloded {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nomononmonom")

    override def eat(animal: Animal): Unit = println(s"I am croc and I eat ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

}
