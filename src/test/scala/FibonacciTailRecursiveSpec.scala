package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTailRecursiveSpec extends AnyFunSuite{
  val fibonacci = new Fibonacci
  test("Test for zero"){
    assert(fibonacci.fibonacciTailRecursive(0) == 0)
  }

  test("Test for 1"){
    assert(fibonacci.fibonacciTailRecursive(1) == 1)
  }

  test("Test for positive Integer"){
    assert(fibonacci.fibonacciTailRecursive(10) == 55)
  }

  test("exception") {
    val exception = intercept[IllegalArgumentException] {
      fibonacci.fibonacciTailRecursive(-2)
    }
    assert(exception.getMessage == "Value must not be negative")
  }
}
