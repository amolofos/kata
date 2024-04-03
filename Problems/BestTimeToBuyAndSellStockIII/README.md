# Question: Best Time to Buy and Sell Stock III
> You are given an array prices where prices[i] is the price of
> a given stock on the ith day. Find the maximum profit you can
> achieve. You may complete at most two transactions. You may not
> engage in multiple transactions simultaneously (i.e., you must
> sell the stock before you buy again).
>
> Example 1:
> Input: prices = [3,3,5,0,0,3,1,4]
> Output: 6
> Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
> Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
>
> Example 2:
> Input: prices = [1,2,3,4,5]
> Output: 4
> Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
> Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before > buying again.
>
> Example 3:
> Input: prices = [7,6,4,3,1]
> Output: 0
> Explanation: In this case, no transaction is done, i.e. max profit = 0.
>
> Example 4:
> Input: prices = [1]
> Output: 0
>
> Constraints:
>  * 1 <= prices.length <= 105
>  * 0 <= prices[i] <= 105

# Script
* Let the candidate start by him/herself.
* What solutions can they think of?
DP, two pointers, brute force?
* Can they elaborate the problem on its domain?
Have they mentioned that we just want to maximise
our profit?
* Try to snap them out of brute force.
* Do they mention any techniques?
Dynamic programming?
Two pointers?
* Based on their level and what their thoughts are
guide them to one of the solutions.

# Edge cases
?

# Solutions
* 4 loops. Time O(n^4), Space O(1).
4 loops so we can create all the possible combinations of
the 4 transactions (buy, sell, buy, sell).
* DP. Time O(n^2), Space O(n)
We go through all the combinations of buy and sell (2 loops) and
record the best profit for one transaction (buy and sell). Then
we loop one more time to add the second transaction.
```
public int maxProfit(int[] prices) {
  int[] oneSaleProfit = new int[prices.length];
  int[] oneSaleDay = new int[prices.length];

  oneSaleProfit[0] = 0;
    oneSaleDay[0] = 0;
  for (int i = 1; i < prices.length; i++) {
    int salePrice = prices[i];
    for (int j = i - 1; j >= 0; j--) {
      int buyPrice = prices[j];
      int profit = salePrice - buyPrice;
      if (profit > oneSaleProfit[i]) {
        oneSaleProfit[i] = profit;
        oneSaleDay[i] = j;
      }
    }
  }

  int maxProfit[] = new int[prices.length];
  maxProfit[0] = 0;
  for (int i = 1; i < prices.length; i++) {
    int maxFromOneSale = oneSaleProfit[i];
    int dayFromOneSale = oneSaleDay[i];
    maxProfit[i] = Math.max(maxProfit[i - 1], maxProfit[dayFromOneSale] + maxFromOneSale);
  }
  return maxProfit[prices.length - 1];
}
```
* DP. Time O(2 * n), Space O(3 * n).
See
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/39681/Generalized-DP-solution-in-Java
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/1523169/Simple-DP-Java-Solution-with-Explanation-or-TLE-to-Accepted
> Idea is simple : Keep track of the minimum value till previous day and
> check how much maximum profit can be obtained for current day.
```
public int maxProfit(int[] prices) {
  if(prices.length == 0)
    return 0;

  int trans = 2;
  int dp[][] = new int[trans + 1][prices.length];

  for(int i = 1; i <= trans; i++) {
    int min = Integer.MAX_VALUE;
    for(int j = 1; j < prices.length; j++) {
      min = Math.min(min, prices[j - 1] - dp[i - 1][j - 1]);
      dp[i][j] = Math.max(dp[i][j - 1], prices[j] - min);
    }
  }
  return dp[trans][prices.length - 1];
}
```
* Financial explanation with state machines. Time O(n), space O(1).
See
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/39615/My-explanation-for-O(N)-solution!
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/794590/Java-O(4)-space-2-ms-runtime-or-using-State-Machine-or-explained
> First assume that we have no money, so buy1 means that we
> have to borrow money from others, we want to borrow less so
> that we have to make our balance > as max as we can (because
> this is negative).
>
> sell1 means we decide to sell the stock, after selling it we
> have price[i] money and we have to give back the money we owed,
> so we have price[i] - |> buy1| = prices[i ] + buy1, we want to
> make this max.
>
> buy2 means we want to buy another stock, we already have sell1
> money, so after buying stock2 we have buy2 = sell1 - price[i]
> money left, we want more > money left, so we make it max
>
> sell2 means we want to sell stock2, we can have price[i] money
> after selling it, and we have buy2 money left before, so
> sell2 = buy2 + prices[i], we > make this max.
>
> So sell2 is the most money we can have.
>
```
public int maxProfit(int[] prices) {
		int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			buy1 = Math.max(buy1, -prices[i]);
			sell1 = Math.max(sell1, buy1 + prices[i]);
			buy2 = Math.max(buy2, sell1 - prices[i]);
			sell2 = Math.max(sell2, buy2 + prices[i]);
		}
		return sell2;
	}
```

# Sources
## LeetCode
123. Best Time to Buy and Sell Stock III: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii
* Hard difficulty
