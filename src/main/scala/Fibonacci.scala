package com.knoldus
import scala.annotation.tailrec

object Fibonacci extends App{
  //a function to compute the nth Fibonacci number using tail recursion
  @tailrec
  def fibonacciTailRecursive(value: Int, previous: Int = 0, current: Int = 1): Int = {
    if(value < 0) throw new IllegalArgumentException("value must not be negative")
    else if (value == 0) previous
    else if (value == 1) current
    else fibonacciTailRecursive(value - 1, current, previous + current)
  }
}
