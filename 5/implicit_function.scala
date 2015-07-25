import scala.language.implicitConversions
import java.time.LocalDate

class DateHelper(offset: Int) {
  def days(when: String) = {
    val today = LocalDate.now
    when match {
      case "ago" => today.minusDays(offset)
      case "from_now" => today.plusDays(offset)
      case _ => today
    }
  }
}

object DateHelper {
  val ago = "ago"
  val from_now = "from_now"
  implicit def convertInt2DateHelper(offset: Int) = new DateHelper(offset)
}

import DateHelper._

val past = 2 days ago
val appointment = 5 days from_now

println(past)
println(appointment)

