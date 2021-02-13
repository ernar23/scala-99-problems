package com.s99.list

/**
 * Insert an element at a given position into a list.
 */
object P21 extends App {

  def insertAt[A](e: A, n: Int, list: List[A]): List[A] = {
    val tuple = list.splitAt(n)
    (tuple._1 :+ e) ::: tuple._2
  }

}
