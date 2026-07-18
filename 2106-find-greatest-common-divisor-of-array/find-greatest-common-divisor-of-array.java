class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int b=nums[0];
        int a=nums[n-1];
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
        
    }