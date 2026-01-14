package Random

import scala.collection.mutable.ListBuffer

object Solution extends App {

  case class Email(to:String)


  val email = List(Email("clayton@gemini.com"), Email("james@gemini.com"),Email("clayton@gemini.com"))

  val data = writeEmail(email)
  println(s"List of emails $data")

  def writeEmail(emails:List[Email]) = {
    println("Starting......")
    if(email.length < 2 ){
      List.empty[List[Email]]
    }else{
      val nonDuplicateEmails = ListBuffer[Email]()

      val pairs = emails.combinations(2).toList

      pairs.map{
        x =>
          val firstValue = x.head
          val secondValue = x(1)
          if (firstValue.to == secondValue.to) {
            println(s"Duplicate emails: $firstValue and $secondValue")
          } else {
            println(s"value x $x")
           x
          }
      }
    }
  }


}