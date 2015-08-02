object DateUtil {
  val ago = "ago"
  val from_now = "from_now"

  implicit class DateHelper(val offset: Int) extends AnyVal {
    def days(when: String) = {
      import java.time.LocalDate
      val today = LocalDate.now
      when match {
        case "ago" => today.minusDays(offset)
        case "from_now" => today.plusDays(offset)
        case _ => today
      }
    }
  }
}

object UseDateUtil extends App {
  import DateUtil._

  val past = 2 days ago
  val appointment = 5 days from_now

  println(past)
  println(appointment)
}
