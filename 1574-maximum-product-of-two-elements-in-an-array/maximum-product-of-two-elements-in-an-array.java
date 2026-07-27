class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int x=nums[n-1]-1;
        int y=nums[n-2]-1;
        return x*y;
        
        
        
    }
}