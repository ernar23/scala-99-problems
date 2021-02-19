package com.s99.arithmetic

/**
 * Goldbach's conjecture.
 * Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers.
 * E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case.
 * It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent).
 * Write a function to find the two prime numbers that sum up to a given even integer.
 */
object P40 extends App {

  def goldbach(num: Int): (Int, Int) = {
    if (num <= 5 || num % 2 != 0) throw new IllegalArgumentException("Provided number must be even and more than 2")
    for (i <- 3 to num) {
      if (P31.isPrime(i) && P31.isPrime(num - i)) return (i, num - i)
    }
    throw new IllegalArgumentException("Numbers were not found for " + num)
  }

}
