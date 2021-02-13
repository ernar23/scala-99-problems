package com.s99.list

import scala.annotation.tailrec

/**
 * Rotate a list N places to the left.
 */
object P19 extends App {

  def rotateBuiltin[A](i: Int, list: List[A]): List[A] = list.drop(i) ++ list.take(i)

  def rotateTailRec[A](i: Int, list: List[A]): List[A] = {
    val func: Int => Int =
      if (i > 0) i => i - 1
      else i => i + 1

    val strategy: List[A] => List[A] =
      if (i > 0) ls => ls.tail :+ ls.head
      else ls => ls.last :: ls.init

    @tailrec
    def iter(acc: List[A], idx: Int, ls: List[A]): List[A] = {
      if (idx == 0) acc
      else iter(strategy(ls), func(idx), strategy(ls))
    }

    iter(Nil, i, list)
  }

}
