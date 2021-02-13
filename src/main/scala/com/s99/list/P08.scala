package com.s99.list

import scala.annotation.tailrec

/**
 * Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a
 * single copy of the element.  The order of the elements should not be changed.
 */
object P08 extends App {

  def compressTailRec[A](list: List[A]): List[A] = {
    @tailrec
    def compressIter(acc: List[A], ls: List[A]): List[A] = {
      if (ls.isEmpty) acc
      else compressIter(acc :+ ls.head, ls.dropWhile(_ == ls.head))
    }

    compressIter(Nil, list)
  }

  def compressTailRec2[A](list: List[A]): List[A] = {
    @tailrec
    def compressIter(acc: List[A], ls: List[A]): List[A] =
      ls match {
        case Nil => acc
        case head :: tail => compressIter(acc :+ head, tail.dropWhile(_ == head))
      }

    compressIter(Nil, list)
  }

  def compressFunctional[A](list: List[A]): List[A] =
    list.foldRight(List[A]())((e, acc) => {
      if (acc.isEmpty || acc.head != e) e :: acc
      else acc
    })

}
