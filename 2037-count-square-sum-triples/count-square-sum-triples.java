class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sqSum = a * a + b * b;
                int c = (int)Math.sqrt(sqSum);    

                if (c <= n && c * c == sqSum)
                 cnt++;
            }
        }
        return cnt;
    }
}