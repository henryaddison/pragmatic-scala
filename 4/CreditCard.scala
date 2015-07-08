import scala.beans.BeanProperty

class CreditCard(@BeanProperty val number: Int, @BeanProperty var creditLimit: Int)
