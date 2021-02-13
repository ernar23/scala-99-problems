package com.s99.list

import scala.annotation.tailrec

/**
 * Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements they should be placed in separate sublists.
 */
object P09 extends App {

  def pack[A](list: List[A]): List[List[A]] = {
    @tailrec
    def iter(acc: List[List[A]], ls: List[A]): List[List[A]] = ls match {
      case Nil => acc
      case head :: _ => iter(acc :+ ls.takeWhile(_ == head), ls.dropWhile(_ == head))
    }

    iter(Nil, list)
  }

}
