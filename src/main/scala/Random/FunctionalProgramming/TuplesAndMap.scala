package Random.FunctionalProgramming

object TuplesAndMap extends App{

  val atuples = new Tuple2("ABCS",2)
  val anotherTuples = (2,"Xs")
  println(anotherTuples)
  println(anotherTuples._1)
  println(anotherTuples.copy(_2 =  "good bye"))
  println(anotherTuples.swap)

  //Map - keys -> values

  val aMap : Map[Int,String] = Map()

  val phoneBook = Map(("Jim",2342),("xdxd",342),("xdx",32))
  println(phoneBook)
  println(phoneBook.contains("jim"))
  println(phoneBook("Jim"))

  val newPairing = "Mary" -> 65

  val newPhoneBook = phoneBook + newPairing
  println(newPhoneBook)

  println(newPhoneBook.map(pair => pair._1.toLowerCase() -> pair._2))

  //filterKeys
  //mapvalues

  println(phoneBook.mapValues(number => number*2))

  // conversions to other collections
  println(phoneBook.toList)
  //  println(List(("Daniel", 555)).toMap)
  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))
  println(names.groupBy(name => name.charAt(0) == 'J'))
}
