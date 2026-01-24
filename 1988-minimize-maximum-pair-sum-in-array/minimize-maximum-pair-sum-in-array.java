class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
          max=Math.max(nums[left]+nums[right],max);
          left++;
          right--;
        }
        return max;
    }
}