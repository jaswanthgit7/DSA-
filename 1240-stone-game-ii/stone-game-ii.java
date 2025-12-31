class Solution {
    public int stoneGameII(int[] piles) {
        int[][][] dp = new int[piles.length+1][piles.length+1][2];
        for(int i=0;i<=piles.length;i++){
            for(int j=0;j<=piles.length;j++) Arrays.fill(dp[i][j],-1);
        }
        return helper(piles,0,1,1,dp);

    }
    int helper(int[] piles, int ind, int turn, int m,int[][][] dp){

        if(ind>=piles.length) return 0;

        if(dp[ind][m][turn]!=-1) return dp[ind][m][turn];

        int take=0;
        int maxi = turn==1?-1:Integer.MAX_VALUE;

        for(int i=1;i<=Math.min(2*m,piles.length-ind);i++){

            take+= piles[ind+i-1];
            if(turn==1){
                maxi = Math.max(maxi,take+helper(piles,i+ind,0,Math.max(m,i),dp));
            }
            else{
                 maxi = Math.min(maxi,helper(piles,i+ind,1,Math.max(m,i),dp));

            }
        }

        return dp[ind][m][turn]=maxi;
    }
}