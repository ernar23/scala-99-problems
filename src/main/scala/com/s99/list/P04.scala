package com.s99.list

import scala.annotation.tailrec

/**
 * Find the number of elements of a list.
 */
object P04 extends App {

  def lengthBuiltin[A](list: List[A]): Int = list.size

  def lengthTailRec[A](list: List[A]): Int = {
    @tailrec
    def sizeOfList(acc: Int, ls: List[A]): Int = {
      if (ls.isEmpty) acc
      else sizeOfList(acc + 1, ls.tail)
    }

    sizeOfList(0, list)
  }

  def lengthFunctional[A](list: List[A]): Int = list.foldLeft(0)((acc, _) => acc + 1)

}
