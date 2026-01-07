class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] grid = new boolean[n][n];
        List<List<String>> res = new ArrayList<>();
        queenOfHearts(grid,0,n,res);
        return res;
    }
    private void queenOfHearts(boolean[][] grid, int row, int n, List<List<String>> res) {
        if (row == n) {
            res.add(beautify(grid,n));
            return;
        }
        for (int c=0; c<n; c++) {
            if (safeToBe(grid,n,row,c)) {
                grid[row][c] = true;
                queenOfHearts(grid,row+1,n,res);
                grid[row][c] = false;
            }
        }
    }
    private boolean safeToBe(boolean[][] grid, int n, int row, int col) {
        for (int i=0; i<row; i++) {
            if (grid[i][col]) {
                return false;
            }
        }
        int minLeft = Math.min(row,col);
        for (int i=1; i<=minLeft; i++) {
            if (grid[row-i][col-i]) {
                return false;
            }
        }
        int minRight = Math.min(row,n-1-col);
        for (int i=1; i<=minRight; i++) {
            if (grid[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }
    private List<String> beautify(boolean[][] grid, int n) {
        List<String> al = new ArrayList<>();
        for (boolean[] row : grid) {
            StringBuilder sb = new StringBuilder();
            for (boolean b : row) {
                if (b) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            al.add(sb.toString());
        }
        return al;
    }
}