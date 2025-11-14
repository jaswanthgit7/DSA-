class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int ans[][]= new int[n][n];
        int x=queries.length;
        for(int i=0;i<x;i++){
            int startrow=queries[i][0];
            int startcol=queries[i][1];
            int endrow=queries[i][2];
            int endcol=queries[i][3];
            for(int k=startrow;k<=endrow;k++){
                for(int j=startcol;j<=endcol;j++){
                    ans[k][j]=ans[k][j]+1;
                }
            }
        }
        return ans;
    }
}