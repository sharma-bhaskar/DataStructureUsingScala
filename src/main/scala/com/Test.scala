package com


/*
*  Longest Substring with unique char
*  abcabacbb -- abc
*/

object Test extends App {

  def longestUniqSubString(s : String) : String  = {
    val lastIndex = Array.fill(256)(-1)

    var left = 0
    var maxLen = 0
    var start = 0

    var right = 0
    while(right < s.length){
      val c = s.charAt(right)
      val idx = lastIndex(c)

      if(idx >= left){
        left = idx + 1
      }

      lastIndex(c) = right

      val winLen = right - left + 1

      if(winLen > maxLen){
        maxLen = winLen
        start = left
      }
      right += 1
    }
    s.substring(start,start + maxLen)
  }

  println(longestUniqSubString("abcabcaabb"))
  println(longestUniqSubString("aaaaaa"))


  println("Hello, Hi how are you!")

}
