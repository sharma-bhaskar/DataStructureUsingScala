package com


//Indian Tax system if any person earning less than 5 LPA than tax should be 0, if person 5 to 10 lakh tax should be 5%,
// if any person earning 10 to 15 lakh tax to 10% and 15 lakh tax 15%, if person
object Sample extends App {
  def calculatTax(income: Double): Double = {
    income match {
      case x if x <= 0 =>
        0
      case x if x <= 500000 =>
        0
      case x if x <= 1000000 =>
        (x - 500000) * 0.05
      case x if x <= 1500000 =>
        (500000 * 0.05) + (x - 1000000) * 0.10
      case x =>
        (500000 * 0.05) + (500000 * 0.10) + (x - 1500000) * 0.15

    }
  }

}
