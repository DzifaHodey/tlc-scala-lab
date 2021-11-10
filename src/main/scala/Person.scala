class Person (title:String, private val firstName:String, private val lastName:String, private val age:Int){
  val fullName: String = s"$title $firstName $lastName"

  println(s"My name is $fullName and I am $age years old.")

  // overloading of constructor
  def this(firstName: String, lastName: String){
    this("Miss", firstName, lastName, 25)
  }

  // setter
  def setAge(newAge: Int):Unit = println(s"My age is now $newAge")


}

object PersonMain extends App{
  val dzifa: Person= new Person("Dzifa", "Hodey")
//  println(dzifa.title)    // cannot access title because it is only a constructor parameter, not a field
  dzifa.setAge(88)
  dzifa setAge 5
}