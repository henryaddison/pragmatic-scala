import scala.collection.mutable._

class Marker private(val colour: String) {
  println(s"Creating ${this}")

  override def toString = s"marker colour $colour"
}

object Marker {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow")
  )

  def getMarker(colour: String) = markers.getOrElseUpdate(colour, new Marker(colour))
  def supportedColours = markers.keys
  def apply(colour: String) = markers.getOrElseUpdate(colour, new Marker(colour))
}

println(s"Supported colours are : ${Marker.supportedColours}")

println(Marker getMarker "blue")
println(Marker getMarker "blue")
println(Marker getMarker "red")
println(Marker getMarker "red")
println(Marker getMarker "green")

println(s"Supported colours are : ${Marker.supportedColours}")

// the following are equivalent
println(Marker("blue"))
println(Marker apply "blue")
