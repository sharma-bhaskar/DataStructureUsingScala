package codility

//You are given a string consisting of digits.
// find the biggest two-digit value that is a consistent fragment of the given string.
object StringHasDigits extends App {

  def solution(s: String): Int = {
    // write your code in Scala 2.12
    var max = 0

    for( i <- 1 until s.length){
      var curr = (s(i - 1) - '0')*10 + (s(i) - '0')
      if(curr > max){
        max = curr
      }
    }
    max
  }

  val result = solution("aaabbsjese")
  println(result)


}
