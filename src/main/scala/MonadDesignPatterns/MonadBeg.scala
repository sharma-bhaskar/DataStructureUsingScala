package MonadDesignPatterns

class MonadBeg {

  case class SafeValue[+T](private val internalValue :T) {
    def get : T = synchronized{
      internalValue
    }
  }

}
