class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] = Math.abs(nums[i]);
        }
        
        Arrays.sort(nums);
        int i = 0, j = n-1;
        long res = 0;
        while(i<j){
            long a = (long) nums[i]*nums[i];
            long b = (long) nums[j]*nums[j];
            res += (b-a);
            i++;
            j--;
        }

        if(i == j)res += nums[i]*nums[i];
        return res;
    }
}