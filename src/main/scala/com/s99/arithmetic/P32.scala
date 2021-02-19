package com.s99.arithmetic

import scala.annotation.tailrec

/**
 * Determine the greatest common divisor of two positive integer numbers.
 */
object P32 extends App {

  @tailrec
  def gcd(i: Int, j: Int): Int = {
    if (i == 0) j
    else gcd(j % i, i)
  }

}
