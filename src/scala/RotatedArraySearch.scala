package src.scala

/**
 * @author Prashant Sharma
 *         https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
object RotatedArraySearch {

    def main(args: Array[String]): Unit = {
        val arr = Array(4, 5, 6, 7, 0, 1, 2)
        val target = 5
        println(searchNum(arr, target))
    }

    def searchNum(arr: Array[Int], target: Int): Int = {
        var lowerIndex = 0
        var higherIndex = arr.length - 1
        while (lowerIndex < higherIndex) {
            val midIndex = (lowerIndex + higherIndex) / 2
            val currItem = arr(midIndex)
            val leftMostItem = arr(lowerIndex)
            val rightMostItem = arr(higherIndex)
            if (currItem == target) return midIndex
            if (leftMostItem <= currItem) {
                if (target >= leftMostItem && target < currItem) higherIndex = midIndex - 1
                else lowerIndex = midIndex + 1
            } else {
                if (target > currItem && target <= rightMostItem) lowerIndex = midIndex + 1
                else higherIndex = midIndex - 1
            }
        }

        if (arr(lowerIndex) == target) lowerIndex else -1
    }
}