package com.s99.list

import scala.annotation.tailrec

/**
 * Reverse a list.
 */
object P05 extends App {

  def reverseBuiltin[A](list: List[A]): List[A] = list.reverse

  def reverseTailRec[A](list: List[A]): List[A] = {
    @tailrec
    def iter(acc: List[A], ls: List[A]): List[A] = {
      if (ls.isEmpty) acc
      else iter(ls.head :: acc, ls.tail)
    }

    iter(Nil, list)
  }

}
