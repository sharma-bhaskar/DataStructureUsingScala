package Random.OOP

import scala.math.ScalaNumericAnyConversions

object Generics extends App{

  //Generic class
  class MyList[A] {

  }

  class MyMap[Key,Value] {

  }

  val listOfInteger = new MyList[Int]
  val stringOfInteger = new MyList[String]

  //Generics Methods

  object MyList {

    def empty[A] : MyList[A] = ???
  }

  val emptyListOfInteger = MyList.empty[Int]

  //Variance Problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //yes List[Cat] extend List[Animal] =
  // 1. Covariance

  class ConvarianceList[+A]
  val animal : Animal = new Cat
  val animalList : ConvarianceList[Animal] = new ConvarianceList[Cat]

  // 2. Invariance

  class InvarianceList[A]
  val invarianceAnimalList : InvarianceList[Animal] = new InvarianceList[Animal]

  //3. ContraVariance

  class ContraVariance[-A]
  val contraVarianceList : ContraVariance[Cat] = new ContraVariance[Animal]



}
