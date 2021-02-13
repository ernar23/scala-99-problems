package com.s99.list

/**
 * Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
 */
object P12 extends App {

  def decode[A](list: List[(Int, A)]): List[A] =
    list flatMap { pair => List.fill(pair._1)(pair._2) }

}
