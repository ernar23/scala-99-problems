package com.s99.list

import scala.annotation.tailrec

/**
 * Extract a slice from a list.
 * Given two indices, I and K, the slice is the list containing the elements from and including
 * the Ith element up to but not including the Kth element of the original list.
 * Start counting the elements with 0.
 */
object P18 extends App {

  def sliceBuiltin[A](start: Int, end: Int, list: List[A]): List[A] = list.slice(start, end)

  def sliceBuiltin2[A](start: Int, end: Int, list: List[A]): List[A] = list.drop(start).take(end - start)

  def sliceTailRec[A](start: Int, end: Int, list: List[A]): List[A] = {
    @tailrec
    def iter(start: Int, end: Int, acc: List[A]): List[A] = {
      if (start != 0) iter(start - 1, end, acc.tail)
      else if (end != list.length) iter(start, end + 1, acc.init)
      else acc
    }

    iter(start, end, list)
  }

}
