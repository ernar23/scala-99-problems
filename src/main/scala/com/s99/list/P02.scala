package com.s99.list

import scala.annotation.tailrec

/**
 * Find the last but one element of a list.
 */
object P02 extends App {

  @tailrec
  def penultimateTailRec[A](list: List[A]): A = {
    list match {
      case Nil => throw new NoSuchElementException
      case head :: Nil => head
      case head :: _ :: Nil => head
      case _ :: tail => penultimateTailRec(tail)
    }
  }

  def penultimateBuiltin[A](list: List[A]): A = list.init.last

}
