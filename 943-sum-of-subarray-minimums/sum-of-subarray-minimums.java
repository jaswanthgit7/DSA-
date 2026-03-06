class Solution {
  public static int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int n = arr.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        int[] sums = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            right[i + 1] = arr[i];
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int curr = right[i];
            int j = i - 1;
            while (right[j] >= curr) {
                j = left[j];
            }
            left[i] = j;
            sums[i] = sums[j] + curr * (i - j);
            ans = (ans + sums[i]) % mod;
        }

        return ans;
    }

}