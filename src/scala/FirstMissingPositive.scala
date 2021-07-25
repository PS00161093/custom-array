package src.scala

/**
 * @author Prashant Sharma
 *         https://leetcode.com/problems/first-missing-positive/
 */
object FirstMissingPositive {

  def main(args: Array[String]): Unit = {
    val nums = Array(1, 2, 0)
    println(firstMissingPositive(nums))
  }

  def firstMissingPositive(nums: Array[Int]): Int = {
    val list = nums.filter(i => i > 0).sorted
    if (list.isEmpty || list(0) > 1) return 1
    for (i <- 0 until list.length - 1) if (list(i + 1) - list(i) >= 2) return list(i) + 1
    list(list.length - 1) + 1
  }
}
