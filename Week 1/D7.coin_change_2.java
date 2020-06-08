/*You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.

Example 1:
Input: amount = 5, coins = [1, 2, 5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1
*/

//Approach is to use dynamic programming
class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length+1][amount+1]; //row consists of available coins and column consists of amounts from 0 to given amount
        dp[0][0] = 1;
        for(int i = 0; i<1; i++){
            for(int j = 1; j <= amount; j++){
                dp[i][j] = 0; 
            }
        }
        for(int i = 0; i<=coins.length; i++){
            for(int j = 0; j < 1 ; j++){
                dp[i][j] = 1;
            }
        }
        
        for(int i = 1; i<=coins.length; i++){
            for(int j=1; j<=amount; j++){
                if(j-coins[i-1] >= 0){ //coin amount should not be greater than the target amount
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]]; //Possibilty without including the coin + possibility with including the coin
                }
                else{
                    dp[i][j] = dp[i-1][j]; //without including the coin amount
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
}