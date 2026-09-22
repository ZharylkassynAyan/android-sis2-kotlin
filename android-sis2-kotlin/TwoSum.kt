// my solution

class Solution {
    fun main(nums: IntArray, t: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == t) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

// video solution(efficient)

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val positions = mutableMapOf<Int, Int>()

        nums.indices.forEach { index ->
            val needed = target - nums[index]

            if (positions.containsKey(needed)) {
                return intArrayOf(positions[needed]!!, index)
            }

            positions[nums[index]] = index
        }

        return intArrayOf()
    }
}
