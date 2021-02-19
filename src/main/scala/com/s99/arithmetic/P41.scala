package com.s99.arithmetic

/**
 * A list of Goldbach compositions.
 * Given a range of integers by its lower and upper limit,
 * print a list of all even numbers and their Goldbach composition.
 */
object P41 extends App {

  def printGoldbachList(range: Range): Unit = {
    printGoldbachListLimited(range, 0)
  }

  def printGoldbachListLimited(range: Range, limit: Int): Unit = {
    range.filter(e => e > 2 && e % 2 == 0).foreach(e => {
      val primes = P40.goldbach(e)
      if (primes._1 > limit) {
        println(e + " = " + primes._1 + " + " + primes._2)
      }
    })
  }

}
