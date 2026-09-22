// my solution

class Solution {
    fun main(prices: IntArray): Int {
        var minP = prices[0]
        var maxPrft = 0

        for (price in prices) {
            if (price < minP) {
                minPrice = price
            }
            val currentPrft = price - minP
            if (currentPrft > maxPrft) {
                maxPrft = currentPrft
            }
        }

        return maxPrft
    }
}

// video solution(efficient)

class Solution {
    fun maxProfit(prices: IntArray): Int {
        return prices.drop(1).fold(
            prices[0] to 0
        ) { (minPrice, maxProfit), price ->
            val newMin = minOf(minPrice, price)
            val newProfit = maxOf(maxProfit, price - minPrice)

            newMin to newProfit
        }.second
    }
}
