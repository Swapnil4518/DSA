class Solution {
    // public static int lcs(String text1, String text2, int n, int m){
    //     if(n==0 || m==0){
    //         return 0;
    //     }
    //     if(text1.charAt(n-1) == text2.charAt(m-1)){
    //         return lcs(text1, text2, n-1, m-1)+1;
    //     }else {
    //         int ans1 = lcs (text1, text2, n-1, m);
    //         int ans2 = lcs (text1, text2, n, m-1);
    //         return Math.max(ans1, ans2);
    //     }
    // }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        // return lcs(text1, text2,n,m);
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++){
           for(int j=1; j<m+1; j++){
            if(text1.charAt(i-1) == text2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1]+1;
            }else{
                int ans1 = dp[i-1][j];
                int ans2 = dp[i][j-1];
                dp[i][j] = Math.max(ans1, ans2);
            }
           }
        }
        return dp[n][m];
        
    }
}