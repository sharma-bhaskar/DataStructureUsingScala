package com.exercise

abstract class MyList {

  /*
    head = first element of  the  list
    tail = remainder of the list
    isEmpty = is this list empty
    add(int) => new list with this element added
    toString => a string representation of the list
  */

  def head: Int

  def tail: MyList

  def isEmpty: Boolean

  def add(element: Int): MyList

  def printElements: String

  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  override def head: Int = throw new NoSuchElementException()

  override def tail: MyList = throw new NoSuchElementException()

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new Cons(element, Empty)

   def printElements: String = ""
}

/**
  * @param head
  * @param tail
  */
class Cons(h: Int, t: MyList) extends MyList {
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element, this)

  def printElements: String = if (t.isEmpty) " " + h else h + " " + t.printElements
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2,Empty))

  println(list.toString)

}
