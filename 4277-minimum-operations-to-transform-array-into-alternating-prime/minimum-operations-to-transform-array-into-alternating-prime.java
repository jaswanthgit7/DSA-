class Solution {
    public int minOperations(int[] nums) {
        int MAX = 200000;
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        int[] nextPrime = new int[MAX + 1];
        int next = -1;
        for (int i = MAX; i >= 0; i--) {
            if (isPrime[i]) {
                next = i;
            }
            nextPrime[i] = next;

        }

        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (i % 2 == 0) {
                ans = ans + (nextPrime[val] - val);
            } else {
                int x = val;
                while (isPrime[x]) {
                    x++;
                }
                ans = ans + (x - val);
            }
        }
        return ans;
    }
}