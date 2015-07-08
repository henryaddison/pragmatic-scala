def echo[T](input1: T, input2: T) = println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")

echo("hello", "there")
echo(4, 6)
echo("hi", 5)


class Message[T](val content: T) {
  override def toString = s"message content is $content"

  def is(value: T) = value == content
}

val message1 : Message[String] = new Message("howdy")
val message2 = new Message(42)

println(message1)
println(message1.is("howdy"))
println(message1.is("hi"))
println(message2.is(22))

println(message2.is('A'))

