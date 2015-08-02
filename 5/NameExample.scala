class Name(val value: String) extends AnyVal {
  override def toString = value
  def length = value.length
}

object UseName extends App {
  def printName(name: Name) {
    println(name)
  }

  val name = new Name("Snowy")
  println(name.length)
  printName(name)
}
