class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        if (n==0)
        return 0;
        if (n==1)
        return 0; 
        int[] end=new int[n];
        int[] start=new int[n];
        Arrays.fill(end, 1);
        Arrays.fill(start, 1);
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                end[i] = end[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                start[i] = start[i + 1] + 1;
            }
        }

        int ans = 0;
        for (int i = 0; i + 1 < n; i++) {
            int k = Math.min(end[i], start[i + 1]);
            ans = Math.max(ans, k);
        }

        return ans;
    }
}
