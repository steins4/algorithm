package dp.coinchange;

public class CoinChange {
    public static int coinChange(int[] k, int amount) {
        int[] dp = new int[amount + 1];
        for (int j = 0; j < amount + 1; j++){
            dp[j] = amount + 1;
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : k) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = min(dp[i-coin] + 1, dp[i]);
            }
        }
        return dp[amount] == amount + 1? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        System.out.println(coinChange(coins, 11));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
