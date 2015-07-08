package finance.currencies

import Currency._

object Converter {
  def convert(money: Money, to: Currency) = {
    //let's just use a fixed conversion rate for now
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
