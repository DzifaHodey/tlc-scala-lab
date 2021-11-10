package oop
object TradeMain extends App {
  val tesla = new Trade("tsla21", "tsla", 50, 80.00)
  println(tesla.value)
  tesla.price = -67.5

  val microsoft = TradeCase("ms21", "ms", 80, 950.0)
  println(microsoft.value)
}
