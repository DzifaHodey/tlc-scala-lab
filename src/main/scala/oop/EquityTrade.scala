package oop

class EquityTrade (id: String, val symbol: String, val quantity: Int, price:Double)
  extends Trade (id, price){

  def value:Double = quantity * price
  override def isExecutable: Boolean = true
  override def toString: String = "This is an Equity Trade"

}
