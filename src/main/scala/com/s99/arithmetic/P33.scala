package com.s99.arithmetic

/**
 * Determine whether two positive integer numbers are coprime.
 */
object P33 extends App {

  def isCoprime(x: Int, y: Int): Boolean = P32.gcd(x, y) == 1

}
