package com.s99.arithmetic

/**
 * Determine whether a given integer number is prime.
 */
object P31 extends App {

  def isPrime(num: Int): Boolean =
    if (num <= 1) false
    else !(2 until num).exists(n => num % n == 0)

  println(isPrime(2))

}
