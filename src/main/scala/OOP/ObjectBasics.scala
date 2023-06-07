package OOP


/**
  *
  * */
object ObjectBasics extends App{

  val person = new Person("John",34)
  person.greet("Abc")
  person.greet()

  val author = new Writer("Adam","Sharma",1992)
  val imposter = new Writer("Adam","Sharma",1992)
  val novel = new Novel("Life of a person",2015,author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc.inc.inc.inc.print()
  counter.dec.print()

}

/**
  * class organise data and behaviour and passing parameter is called constructor
  * @param name its a scala parameter not field
  * @param age
  * scala parameter and scala field is two different things
  * declare a function inside called method
  */
class Person(name: String,val age:Int = 0) {
  val x = 2
  println(x)

  //Methods
  def greet(name:String): Unit = {
    println(s"${this.name} says - Hi $name")
  }

  //Method overloading
  def greet() : Unit = println(s"Hi, I am $name")

  //Mutiple constructors

  //Auxillury constructor
  def this(name:String) = this(name,0)

  def this() = this("john doe")
}

/**
  * /*
  Novel and a Writer
  Writer: first name, surname, year
    - method fullname
  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel
 */
  * */

class Writer(firstName:String,surname:String, val year:Int){

  def fullName : String = firstName + " " + surname

}

class Novel(name:String,year:Int,author:Writer){

  def authorAge:Int = year - author.year

  def isWrittenBy(author:Writer): Boolean = author == this.author

  def copy(newYear:Int): Novel = Novel(name,newYear,author)

}


/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

class Counter(val count : Int = 0) {
  def print(): Unit = println(count)

  def inc : Counter ={
    new Counter(count+1)
  }

  def dec : Counter = {
   new Counter(count-1)
  }

  def inc(n : Int) :Counter = {
    if (n <= 0) this
    else inc.inc(count + n)
  }

  def dec(n:Int) :Counter = {
    if(n <= 0) this
    else dec.dec(count - n)
  }


}