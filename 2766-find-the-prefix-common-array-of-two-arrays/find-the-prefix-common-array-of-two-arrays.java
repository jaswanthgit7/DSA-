class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] pre= new int[n + 1];
        int[] ans = new int[n];
        int same= 0;
        for (int i = 0; i < n; i++) {
            pre[A[i]]++;

            if (pre[A[i]] == 2)
                same++;

            pre[B[i]]++;

            if (pre[B[i]] == 2)
                same++;

            ans[i] = same;
        }

        return ans;
    }
}