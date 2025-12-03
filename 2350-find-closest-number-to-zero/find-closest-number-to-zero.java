class Solution {
    public int findClosestNumber(int[] nums) {
        int x= 0;
        int min= Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);

            if (abs < min || (abs== min && abs > x)) {
                x = nums[i];
                min= abs;
            }
        }  

        return x; 
    }
}