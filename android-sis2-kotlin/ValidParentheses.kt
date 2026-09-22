class Solution {
    fun main(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (i in 0 until s.length) {
            val char = s[i]
            if (char == '(' || char == '[' || char == '{') {
                stack.add(char)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
                val ltIn = stack.size-1
                val lt = stack[ltIn]
                stack.removeAt(ltIn)
                
                if (char == ')' && lt != '(') return false
                if (char == ']' && lt != '[') return false
                if (char == '}' && lt != '{') return false
            }
        }
        return stack.isEmpty()
    }
}

// video solution

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
