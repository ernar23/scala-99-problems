package com.s99.arithmetic

/**
 * Calculate Euler's totient function phi(m).
 */
object P34 extends App {

  def totient(num: Int): Int =
    1 until num count { x => P33.isCoprime(x, num) }

  println(totient(10))

}
