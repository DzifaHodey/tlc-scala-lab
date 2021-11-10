package oop
abstract class Trade (val id: String){

  // Second constructor
  def this (id: String, price: Double) = {
    this(id)
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

  def isExecutable: Boolean
  override def toString: String = s"This is ${this.getClass.getName}"
}

// Companion object for static methods
//object Trade {
//  def apply(id: String, symbol:String, quantity: Int, price: Double) = new Trade(id)
//}
