class Solution {
    public int minOperations(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length-1;
        while(n>-1) {
            if(set.contains(nums[n])) {
                break;
            }
            set.add(nums[n]);
            n--;
        }
        return (n+3)/3;
    }
}