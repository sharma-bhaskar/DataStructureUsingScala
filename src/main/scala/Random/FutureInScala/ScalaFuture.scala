package Random.FutureInScala

/**
  * Coding Participant Challenge using sync manner
  * 1. Register a pariticpant
  * 2. fetch Contest Info
  * 3. fetch User Infor
  *
  * */
object ScalaFuture {
  def main(args: Array[String]): Unit = {
    val firstParticipant = registerParticipant(1, 1)

    println(s"${Thread.currentThread()} ==> Main thread is running")

  }

  def registerParticipant(userId: Int, contestId: Int): Boolean = {
    println(s"${Thread.currentThread()} ==> register participant thread")

    val contestInfo = fetchContestInfo(contestId)
    val userInfo = fetchUserInfo(userId)

    println(s"${Thread.currentThread()} ==> \t contestInfo " + contestInfo + "\t userInfo " + userInfo)
    true
  }

  def fetchContestInfo(contestId: Int): ContestInfo = {
    println(s"${Thread.currentThread()} ==> fethcContestInfo Thread")

    ContestInfo(contestId, "HackerTest")
  }

  def fetchUserInfo(userId: Int): UserInfo = {
    println(s"${Thread.currentThread()} ==> fetchUserInfo Thread")

    UserInfo(userId, "Bhaskar", "bhaskar@bhaskar")
  }
}
