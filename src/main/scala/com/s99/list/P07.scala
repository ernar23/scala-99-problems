package com.s99.list

/**
 * Flatten a nested list structure.
 */
object P07 extends App {

  def flatten(list: List[Any]): List[Any] = {
    list flatMap {
      case ls: List[_] => flatten(ls)
      case e => List(e)
    }
  }

}
