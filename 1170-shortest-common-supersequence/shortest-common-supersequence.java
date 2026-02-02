class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int n = s1.length();
        int  m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        StringBuilder ss=new StringBuilder();
        int i=n,j=m;
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ss.append(s1.charAt(--i));
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                ss.append(s1.charAt(--i));
            }
            else
            {
                ss.append(s2.charAt(--j));
            }
        }
        while(i>0) ss.append(s1.charAt(--i));
        while(j>0)  ss.append(s2.charAt(--j));
        return ss.reverse().toString();
    }
}