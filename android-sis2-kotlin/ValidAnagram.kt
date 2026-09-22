class Solution {
    fun main(s: String, s2: String): Boolean {
        return s.groupingBy { it }.eachCount() ==
               s2.groupingBy { it }.eachCount()
    }
}

