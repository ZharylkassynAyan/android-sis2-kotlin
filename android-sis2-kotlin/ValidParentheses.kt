class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()

        s.forEach { char ->
            when (char) {
                '(', '[', '{' -> stack.add(char)

                ')', ']', '}' -> {
                    if (stack.isEmpty()) return false

                    val last = stack.removeLast()

                    if (
                        (char == ')' && last != '(') ||
                        (char == ']' && last != '[') ||
                        (char == '}' && last != '{')
                    ) {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}
