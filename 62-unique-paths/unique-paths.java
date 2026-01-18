class Solution {
    static int[][] arr;
    public int uniquePaths(int m, int n) {
        arr= new int[m+1][n+1];
        return countPaths(m, n);
    }

    static int countPaths(int m, int n){
        if(m == 1 || n == 1){
            return 1;
        }
        if(arr[m][n] != 0)
         return  arr[m][n];
        
        arr[m][n] = countPaths(m, n-1) + countPaths(m-1, n);
        return arr[m][n];
    }
}