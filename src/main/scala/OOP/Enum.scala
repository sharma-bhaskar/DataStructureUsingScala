package OOP

object Enum extends App {

  /**
    *
    */
  enum Permission {
    case READ, WRITE, EXECUTE, NONE

    def openDocument(): Unit = {
      if (this == READ) println("open Document") else println("Dont have permission ")
    }
  }


  val somePermission: Permission = Permission.READ
  println(somePermission)

}
