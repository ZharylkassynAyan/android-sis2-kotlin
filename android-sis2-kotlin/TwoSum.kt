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
