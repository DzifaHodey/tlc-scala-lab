package oop

import org.scalatest.FunSuite

class TransactionTest extends FunSuite {

  test("testAmount") {
    val tr1 = new Transaction("34nbd", "tr", 50, 45.00)
    assert(tr1.amount === 2542.50)

  }

}
