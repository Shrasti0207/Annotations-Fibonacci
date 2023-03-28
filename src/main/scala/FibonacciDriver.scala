package com.knoldus
import scala.util.Try

object FibonacciDriver extends App{
  val fibonacci = new Fibonacci
  val resultForPositive = Try(fibonacci.fibonacciTailRecursive(10))
  val resultForNegative = Try(fibonacci.fibonacciTailRecursive(-2))

  resultForPositive match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  resultForNegative match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
}