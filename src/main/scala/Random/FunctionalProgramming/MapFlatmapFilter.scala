package Random.FunctionalProgramming

object MapFlatmapFilter extends App {

  val list = List(1,2,3,4)

  println(list.head + " tail "+list.tail)

  //map
  println(list.map(x => x+1))
  println(list.map( _.+("is a number")))

  //filter
  println(list.filter(x => x%2 == 0))

  //flatmap
  val toPair = (x :Int) => List(x,x+1)
  println(list.flatMap(toPair))

  // print all combinations between two lists
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')

  // List("a1", "a2"... "d4")

  val combine = numbers.flatMap(n => chars.map(x => "" + x + n))

  val colors = List("black", "white")

  println(combine)

  val combination = numbers.flatMap(n => chars.flatMap(x => colors.map(c=> "" + n +x+c )))
  println(combination)

  val evenNumberCombination = numbers.filter(x => x%2 == 0).flatMap(n => chars.flatMap(x => colors.map(c => "" +n+c+x)))
  println(evenNumberCombination)

  //foreach
  list.foreach(println)

  //for comprehension

  val forCombination = for{
    n <- numbers
    c <- chars
    cl <- colors
  } yield "" + n + c + cl

  println(forCombination)

  //for comprehension

  val evenCombination = for{
    n <- numbers if n%2 ==0
    c <- chars
    cl <- colors
  } yield "" + n + c + cl

  for {
    n <- numbers
  } println(n)

  println(list.map{x => x*2})

  println(evenCombination)

}
