
import scala.collection.{SortedSet}
import scala.util.Random

object CollectionsLab {
  def main(args: Array[String]): Unit = {
//    println(remove(Seq(2,3,4,5,6), 3))
//    println(removeAgain(Seq(34,6,7,8), 0))

    println(lottery)


    println(setLottery)

  }

  // remove element at given index from Sequence Collections
  def remove(collection: Seq[Any], idx: Int) ={
    var newCollection: Seq[Any] = Nil
    for (i <- 0 to collection.length-1) {
      if (i != idx) newCollection = newCollection:+collection(i)
    }
    newCollection
  }

  def removeAgain(collection: Seq[Any], idx: Int)={
    collection.take(idx) ++ collection.drop(idx + 1)
  }

  // Lottery
  def lottery ={
    var numbers:SortedSet[Int] = SortedSet()
    for (_ <- 1 to 6) numbers = numbers.+(Random.between(1,49))
    numbers
  }

  val setLottery = SortedSet(Random.shuffle(1 to 49).take(6): _*)

}
