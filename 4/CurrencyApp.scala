import finance.currencies._

object CurrencyApp extends App {
  var moneyInGBP = new Money(10, Currency.GBP)

  println(Charge.chargeInUSD(moneyInGBP))
  println(Converter.convert(moneyInGBP, Currency.USD))
}
