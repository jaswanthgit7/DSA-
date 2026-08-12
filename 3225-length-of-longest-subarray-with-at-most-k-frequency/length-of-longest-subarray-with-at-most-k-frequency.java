class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        int i=0,j=0;
        int ans=1;
        while(j<n){
            if(freq.containsKey(nums[j])){
                freq.put(nums[j],freq.get(nums[j])+1);
            }else{
                freq.put(nums[j],1);
            }
            while(freq.get(nums[j])>k){
                freq.put(nums[i],freq.get(nums[i])-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}