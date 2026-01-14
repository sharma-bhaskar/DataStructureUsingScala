package com

import scala.annotation.tailrec

class Node(var value: Int, var next: Node){
  override def toString: String = {
    s"$value -> ${if (next == null) "null" else next.toString}"
  }
}

object TestNiel extends App{
  // 1 -> 2 -> 3 -> Nil

  val n = new Node(3,null)
  val n1 = new Node(2,n)
  val n2 = new Node(1,n1)

  println(n2)

  //reverse
  println("tail rec   "+reverseNodeTail(n2))

  val list = List(1,2,3)

  println(reverseTail(list))


  def reverse(head: Node) : Node = {
    var prev : Node = null
    var curr : Node = head

    while(curr != null){
      val next = curr.next
      curr.next = prev
      prev = curr
      curr = next
    }
    prev
  }

  //tailRec

  def reverseTail(list:List[Int]) : List[Int] = {
    def tailRev(rem: List[Int],acc: List[Int]) : List[Int] = {
      rem match {
        case Nil => acc
        case head :: tail =>
          tailRev(tail, head :: acc)
      }
    }

    tailRev(list,Nil)

  }

  def reverseNodeTail(head:Node):Node = {

    @tailrec
    def tailNodeRev(curr: Node, prev:Node) : Node = {
      if(curr == null) prev
      else {
        val next = curr.next
        curr.next = prev
        tailNodeRev(next,curr)
      }

    }

    tailNodeRev(head,null)

  }




}
