package com.s99.arithmetic

import scala.annotation.tailrec

/**
 *  A list of prime numbers.
 *  Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
 */
object P39 extends App {

  def listPrimesInRangeFunctional(range: Range): List[Int] =
    (for {
      i <- range.start to range.end
      if P31.isPrime(i)
    } yield i).toList

  def listPrimesInRangeTailRec(range: Range): List[Int] = {
    @tailrec
    def iterate(acc: List[Int], listOfRange: List[Int]): List[Int] = {
      if (listOfRange.isEmpty) acc.sorted
      else if (P31.isPrime(listOfRange.head)) iterate(listOfRange.head :: acc, listOfRange.tail)
      else iterate(acc, listOfRange.tail)
    }

    iterate(Nil, range.toList)
  }

}
