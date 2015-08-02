object UseInterpolator extends App {
  import MyInterpolator._

  val ssn= "123-45-6789"
  val account = "0246781263"
  val balance = 2014523

  println(mask"""Account: $account
    |Social Security Number: $ssn
    |Balance $$^${balance}
    |Thanks for your business.""".stripMargin)
}
