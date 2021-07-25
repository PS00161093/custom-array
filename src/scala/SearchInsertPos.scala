package src.scala

/**
 * @author Prashant Sharma
 *         Problem-url: https://leetcode.com/problems/search-insert-position/
 */

import scala.annotation.tailrec

object SearchInsertPos {

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 3)
    val target = 5
    println(getIndex(arr, target))
  }

  def getIndex(arr: Array[Int], target: Int): Int = {
    if (target == 0 || target <= arr(0)) 0
    else if (target > arr(arr.length - 1)) arr.length
    else {
      @tailrec
      def index(n: Int, t: Int, i: Int): Int = {
        if (n >= t) i
        else index(arr(i + 1), t, i + 1)
      }

      index(arr(1), target, 1)
    }
  }
}