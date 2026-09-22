// my solution

class Solution {
    fun main(nums: IntArray, t: Int): Int {
        for (i in 0 until nums.size) {
            if (nums[i] == t) {
                return i
            }
        }
        return -1
    }
}

// video solution(efficient)

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val middle = (left + right) / 2

            when {
                nums[middle] == target -> return middle
                nums[middle] < target -> left = middle + 1
                else -> right = middle - 1
            }
        }

        return -1
    }
}
