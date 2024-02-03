class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            int maxVal = 0;
            for (int j = 1; j <= Math.min(i + 1, k); j++) {
                maxVal = Math.max(maxVal, arr[i - j + 1]);
                if (i >= j) {
                    dp[i] = Math.max(dp[i], dp[i - j] + maxVal * j);
                } else {
                    dp[i] = Math.max(dp[i], maxVal * j);
                }
            }
        }
        
        return dp[n - 1];
    }
}
