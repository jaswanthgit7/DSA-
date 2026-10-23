class Solution {
    public int projectionArea(int[][] grid) {
        int m = grid.length;
        int top, front, side, xy, yz;
        top = front = side = xy= yz= 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] != 0) ++top;
                xy = Math.max(xy, grid[i][j]);
                yz = Math.max(yz, grid[j][i]);
            }
            front += xy;
            side += yz;
        xy=yz=0;
        }
        return top+front+side;
    }
}