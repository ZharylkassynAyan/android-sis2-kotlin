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
