package Random.FutureInScala

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


/**
  *
  * */
object AsyncScala {
  def main(args: Array[String]): Unit = {
    val firstParticipant = registerParticipant(1, 1)

    firstParticipant.foreach{registered =>
      println(s"${Thread.currentThread()} ==> Main thread is running "+registered)
    }

    println(s"${Thread.currentThread()} ==> Main thread is running")
    Thread.sleep(1000)

  }

  def registerParticipant(userId: Int, contestId: Int): Future[Boolean] = Future{
    println(s"${Thread.currentThread()} ==> register participant thread")

    val contestInfo = fetchContestInfo(contestId)
    val userInfo = fetchUserInfo(userId)

    for{
      cInfo <- contestInfo
      uInfo <- userInfo
    } yield {
      println(s"${Thread.currentThread()} ==> \t contestInfo " + contestInfo + "\t userInfo " + userInfo)
    }

    true
  }

  def fetchContestInfo(contestId: Int): Future[ContestInfo] = Future{
    println(s"${Thread.currentThread()} ==> fethcContestInfo Thread")

    Thread.sleep(2000L)
    ContestInfo(contestId, "HackerTest")
  }

  def fetchUserInfo(userId: Int): Future[UserInfo] = Future{
    println(s"${Thread.currentThread()} ==> fetchUserInfo Thread")

    Thread.sleep(2000L)
    UserInfo(userId, "Bhaskar", "bhaskar@bhaskar")
  }


}

case class UserInfo(id: Int, name: String, email: String)

case class ContestInfo(id: Int, title: String)

