class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int neg=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val<0)
                neg++;
                ans+=Math.abs(val);
                min=Math.min(min, Math.abs(val));
            }
        }

        if (neg % 2 == 0)
        return ans;
        return ans - 2 * min;
    }
}