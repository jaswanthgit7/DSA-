class Solution {
    public int findFinalValue(int[] nums, int key) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==key)
             key*=2;
        }
        return key;
    }
}