package com.s99.list

/**
 * Find out whether a list is a palindrome.
 */
object P06 extends App {

  def isPalindromeBuiltin[A](list: List[A]): Boolean =
    list.take(list.length / 2) == list.takeRight(list.length / 2).reverse

  def isPalindromeBuiltin2[A](list: List[A]): Boolean = list == list.reverse

}
