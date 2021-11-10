package oop

class FXTrade (id: String, price:Double) extends Trade (id, price){
  override def isExecutable: Boolean = false
}
