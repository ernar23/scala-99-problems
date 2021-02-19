package com.s99.arithmetic

/**
 * Determine the prime factors of a given positive integer (2).
 * Construct a list containing the prime factors and their multiplicity.
 */
object P36 extends App {

  def primeFactorMultiplicityMap(num: Int): List[(Int, Int)] =
    P35.primeFactors(num)
      .groupBy(identity)
      .view
      .mapValues(_.size)
      .toList
      .sortBy(_._1)

}
