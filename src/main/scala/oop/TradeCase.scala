package oop

case class TradeCase(id: String, symbol:String, quantity: Int, newPrice:Double =0.0) {
//  def this (id: String, symbol:String, quantity: Int, price: Double) = {
//    this(id, symbol, quantity)
//    this.price = price
//  }

  private var _price = newPrice    //default price
  def price = _price        //getter method
  // setter method
  def price_=(value: Double) =  {
    if (value >= 0) _price = value
    else {
      println("Invalid price given")
      _price = 0.0
    }
  }

  def value:Double = quantity * price

}
