package codility

import com.typesafe.config.ConfigFactory

import scala.annotation.tailrec
import scala.util.Try

case class RuleEval(rule: String, value: Int)

object ListTest extends App {

  lazy val orderCombination = ConfigFactory.load("ruleName.conf").getStringList("orderProtocolExtension")

  val simplelist = List("derivatives#amlKyc", "derivatives#combinedGoodToTradeStatus", "derivatives#imAcaPledgor", "derivatives#regImCsa", "derivatives#imAcaSecuredParty", "derivatives#regVmCsa")

  val list = List("a", "b", "c", "d", "e")


  val config = ConfigFactory.load("ruleName.conf")

  val env = config.getConfig("uat1")

  val verify = Try(env.getString("verify")).getOrElse("verify")


  val result = list.sortWith((x, y) => {
    println(x + "  " + y)
    if (x == "a" || x == "e") true else false
  })

  println(result)

  def sortByRule(str: String, str1: String) = {
    if (str.equals("a") && str1.equals("b")) {
      true
    } else
      false

  }

}
