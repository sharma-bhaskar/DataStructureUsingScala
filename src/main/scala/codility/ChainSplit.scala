package codility

object ChainSplit extends App {

  def solution(a: Array[Int]): Int = {
    val arrayLen = a.length
    val b = new Array[Int](arrayLen)

    b(arrayLen - 2) = a(arrayLen - 2)

    for(i <- (arrayLen - 3) to 0 by -1){
      b(i) = b(i+1).min(a(i))
    }

    for(i <- 2 until arrayLen){
      a(i) = a(arrayLen - 1).min(a(i))
    }

    (2 until (arrayLen - 2)).map { i => a(i - 1) + b(i + 1)}.min

  }

}
