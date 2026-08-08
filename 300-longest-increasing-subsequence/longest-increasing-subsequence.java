class Solution {
    public int lengthOfLIS(int[] nums) {

        int[] num1 = nums;
        int[] num2 = nums.clone();

        Arrays.sort(num2);

        // Remove duplicates
        int k = 0;

        for (int i = 0; i < num2.length; i++) {
            if (i == 0 || num2[i] != num2[i - 1]) {
                num2[k++] = num2[i];
            }
        }

        int n = num1.length;
        int m = k;

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (num1[i - 1] == num2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }

        return dp[n][m];
    }
}