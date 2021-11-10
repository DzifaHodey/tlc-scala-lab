package oop
class Trade (val id: String, val symbol: String, val quantity: Int){

  // Second constructor
  def this (id: String, symbol:String, quantity: Int, price: Double) = {
    this(id, symbol, quantity)
    this.price = price
  }

  private var _price = 0.0    //default price
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

  override def toString: String =
    s"""Trade $symbol ($id):
       |Quantity= $quantity
       |Price= $$$price
       |""".stripMargin
}

// Companion object for static methods
object Trade {
  def apply(id: String, symbol:String, quantity: Int, price: Double) = new Trade(id, symbol, quantity, price)
}
