class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
        return 0;
        int left=0;
        int right = 0;
        int pro = 1;
        int cnt = 0;
        int n=nums.length;

        while (right < n) {
            pro *=nums[right];
            while(pro >= k)
            pro/=nums[left++];
            cnt +=1+(right - left);
            right++;
        }

        return cnt;
    }
} 