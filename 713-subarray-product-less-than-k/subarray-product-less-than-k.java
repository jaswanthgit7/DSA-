class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt=0;
        int pro=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pro*=nums[j];
                if(pro<k){
                    cnt++;
                }
                else{
                    break;
                }
            }
            pro=1;
        }
        return cnt;
    }
}