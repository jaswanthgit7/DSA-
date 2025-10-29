class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
         for (int i=1;i<=n;i++) {
            int maxi=0;
            int max=0;
            for (int j=1;j<=k&&i-j>=0;j++) {
                maxi=Math.max(maxi,arr[i-j]);
                max=Math.max(max,dp[i-j]+maxi*j);
            }
            dp[i]=max;
        }

        return dp[n];
    }
}