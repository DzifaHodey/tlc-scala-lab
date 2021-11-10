package library

class Customer(val membershipType: String) {
  var numberOfBooksToBorrow : Int=0
  numberOfBooksToBorrow = membershipType match {
    case "junior" => 10
    case "regular" => 20
    case "senior" => 40
    case _ => 0
  }

  override def toString: String = s"$membershipType: $numberOfBooksToBorrow books"

}
