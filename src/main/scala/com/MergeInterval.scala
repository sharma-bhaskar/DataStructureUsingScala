package com

object MergeInterval extends App {

  val intervals = List((1,3), (2,6), (8,10), (9,18))
  println(mergeInterval(intervals))

  def mergeInterval(interval: List[(Int, Int)]): List[(Int, Int)] = {
    if (interval.isEmpty) return Nil

    val sortedInterval = interval.sortBy(_._1)

    sortedInterval.tail.foldLeft(List(sortedInterval.head)) { (acc, curr) =>
      val (lastStart, lastEnd) = acc.head
      val (curStart, curEnd) = curr
      if (curStart <= lastEnd) {
        (lastStart, math.max(lastEnd, curEnd)) :: acc.tail
      } else {
        curr :: acc
      }
    }.reverse
  }

}
