package com.s99.list

import scala.annotation.tailrec

/**
 * Run-length encoding of a list (direct solution).
 * Implement the so-called run-length encoding data compression method directly.
 * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
 */
object P13 extends App {

  def encodeDirectTailRec[A](list: List[A]): List[(Int, A)] = {
    @tailrec
    def iter(acc: List[(Int, A)], ls: List[A]): List[(Int, A)] = ls match {
      case Nil => acc
      case list =>
        val repeats = list.takeWhile(_ == list.head)
        iter(acc :+ (repeats.size, repeats.head), list.dropWhile(_ == list.head))
    }

    iter(Nil, list)
  }

  def encodeDirectTailRec[A](list: List[A]): List[(Int, A)] = {
    @tailrec
    def iter(acc: List[(Int, A)], ls: List[A]): List[(Int, A)] = {
      ls match {
        case Nil => acc
        case list =>
          val (repeats, tail) = list.span(_ == list.head)
          iter(acc :+ (repeats.size, repeats.head), tail)
      }
    }

    iter(Nil, list)
  }

}
