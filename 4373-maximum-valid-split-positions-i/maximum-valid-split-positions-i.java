class Solution {
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int max = fn(nums, n);
        for (int i = 0; i < n; i++) {
            int[] temp = new int[n - 1];
            for (int j = 0, idx = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                temp[idx++] = nums[j];
            }

            max = Math.max(max, fn(temp, n - 1));
        }

        return max;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    private int fn(int[] nums, int n) {
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            prefix[i] = gcd(prefix[i - 1], nums[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = gcd(suffix[i + 1], nums[i]);
        }

        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prefix[i] == suffix[i + 1]) {
                cnt++;
            }
        }

        return cnt;
    }
}