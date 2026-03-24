class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[]res=new int[n*m];
        int[]arr=new int[n*m];
        int idx=0,mod=12345;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[idx++]=grid[i][j];
            }
        }
        Arrays.fill(arr,1);
        long left=1;
        for(int i=0;i<res.length;i++){
            arr[i]=(int)((arr[i]*left)%mod);
            left=(left*res[i])%mod;
        }
        long right=1;
        for(int i=res.length-1;i>=0;i--){
            arr[i]=(int)((arr[i]*right)%mod);
            right=(right*res[i])%mod;
        }
        idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=arr[idx++];
            }
        }
        return grid;
    }
}