package src.scala

/**
 * @author Prashant Sharma
 *         https://leetcode.com/problems/jump-game-ii
 */
object MinJumpToEnd {

    def main(args: Array[String]): Unit = {
        val nums = Array(2, 3, 1)
        println(jump(nums))
    }

    def jump(nums: Array[Int]): Int = {
        var furthest = nums(0)
        var maxPos = 0
        var steps = 0

        1 until nums.length foreach (i => {
            if (i > maxPos) {
                steps += 1
                maxPos = furthest
            }
            if (maxPos >= nums.length - 1) {
                steps
            }
            else furthest = math.max(furthest, nums(i) + i)
        })
        steps
    }
}
