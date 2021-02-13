package com.s99.list

import scala.annotation.tailrec

/**
 * Find the last element of a list.
 */
object P01 extends App {

  @tailrec
  def lastTailRec[A](list: List[A]): A = {
    list match {
      case Nil => throw new NoSuchElementException
      case head :: Nil => head
      case _ :: tail => lastTailRec(tail)
    }
  }

  def lastBuiltin[A](list: List[A]): A = list.reverse.head

  def lastBuiltin2[A](list: List[A]): A = list.last

}
