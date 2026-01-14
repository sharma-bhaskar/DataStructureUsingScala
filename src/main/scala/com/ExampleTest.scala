package com

/**
  * Given an array of end of the day stock prices for ICICI Bank – [ 23, 7, 8, 6, 9, 7, 22, 5, 12 ]
  * Write a method maxProfit which will take this array and print when to buy (buyIndex), when to sell (sellIndex) and maxProfit obtained.
  * Note than you have to buy first before you can sell.
  * For example, in the above array, you have to buy at 6 and sell 22 to get the maxProfit of 16.
  *
  * */
object ExampleTest extends App {

  val array = Array(23, 7, 8, 6, 9, 7, 22, 5, 12, 25)
  maxProfit(array)

  def maxProfit(prices: Array[Int]): Unit = {
    if (prices.length < 2) {
      println(" dont have data")
    }

    var minPrice = prices(0)
    var minIndex = 0

    var buyIndex = 0
    var sellIndex = 0
    var maxProfit = 0

    for (i <- 1 until prices.length) {
      val profit = prices(i) - minPrice

      if (profit > maxProfit) {
        maxProfit = profit
        buyIndex = minIndex
        sellIndex = i
      }
      if (prices(i) < minPrice) {
        minPrice = prices(i)
        minIndex = i
      }
    }
    println(s"buyIndex of the stock $buyIndex")
    println(s"sellIndex of the stock $sellIndex")
    print(s"maxProfit of the stock $maxProfit")

  }


}
