package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTailRecursiveSpec extends AnyFunSuite{
  test("Test for zero"){
    assert(Fibonacci.fibonacciTailRecursive(0) == 0)
  }

  test("Test for 1"){
    assert(Fibonacci.fibonacciTailRecursive(1) == 1)
  }

  test("Test for positive Integer"){
    assert(Fibonacci.fibonacciTailRecursive(10) == 55)
  }

  test("exception") {
    val exception = intercept[IllegalArgumentException] {
      Fibonacci.fibonacciTailRecursive(-2)
    }
    assert(exception.getMessage == "Value must not be negative")
  }
}
