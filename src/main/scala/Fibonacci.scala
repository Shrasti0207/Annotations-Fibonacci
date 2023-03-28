package com.knoldus
import scala.annotation.tailrec

class Fibonacci {
  //a function to compute the nth Fibonacci number using tail recursion
  @tailrec
  final def fibonacciTailRecursive(value: Int, previous: Int = 0, current: Int = 1): Int = {
    if(value < 0) throw new IllegalArgumentException("Value must not be negative")    //value will be negative
    else if (value == 0) previous                                                     // if value is 0
    else if (value == 1) current                                                      // if value is 1
    else fibonacciTailRecursive(value - 1, current, previous + current)       // recursively call and return the current
  }
}


