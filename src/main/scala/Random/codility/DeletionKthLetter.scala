package Random.codility

object DeletionKthLetter extends App {
  def solution(s: String, c: Array[Int]): Int = {
    // write your code in Scala 2.12
    var totalCost = 0
    var prev = s.charAt(0)
    var maxCost = c(0)
    var curTotalCost = c(0)
    val strLength = s.length
    for (i <- 1 until strLength) {
      val ch = s.charAt(i)
      var curCost = c(i)
      if (ch == prev) {
        maxCost = Math.max(maxCost, curCost)
        curTotalCost += curCost
      } else {
        totalCost += curTotalCost - maxCost
        prev = ch
        maxCost = curCost
        curTotalCost = curCost
      }
    }
    totalCost += curTotalCost -maxCost
    totalCost
  }


}
