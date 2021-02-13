package com.s99.list

/**
 * Modified run-length encoding. Modify the result of problem P10 in such a way that
 * if an element has no duplicates it is simply copied into the result list.
 * Only elements with duplicates are transferred as (N, E) terms.
 */
object P11 extends App {

  def encodeModified[A](list: List[A]): List[Any] = {
    P09.pack(list) map {
      case head :: Nil => head
      case list => (list.size, list.head)
    }
  }

}
