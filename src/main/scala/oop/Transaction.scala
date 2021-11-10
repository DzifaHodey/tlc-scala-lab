package oop

class Transaction(id: String, symbol: String,quantity: Int, price:Double)
  extends EquityTrade(id,symbol,quantity,price) with FeePayable with Taxable {

  override def flatFee: Double = 10.00
  override def tax: Double = 0.125
  def amount: Double = {
    val totalVal = value + flatFee
    totalVal + (tax*totalVal)
  }
}

trait FeePayable {
  def flatFee:Double
}

trait Taxable {
  def tax:Double
}

