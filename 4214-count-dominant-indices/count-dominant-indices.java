class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if((n-i-1)>0 && (nums[i]>(sum-arr[i])/(n-i-1))){
                ans++;
            }
        }
        return ans;
    }
}