object BasicFuncLab extends App {

  def operation(s: String): (Int, Int) => Int = {

    s match {
      case "add" => (a: Int, b: Int) => a + b
      case "subtract" => (a: Int, b: Int) => a - b
      case "power" => (a: Int, b: Int) => Math.pow(a, b).toInt
    }
  }

  val add = operation("add")
  val subtract = operation("subtract")
  val power = operation("power")
  println(power(2,3))

//  println(operation("power") (2, 2))


}
