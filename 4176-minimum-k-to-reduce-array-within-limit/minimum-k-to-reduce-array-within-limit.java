class Solution {
    public int minimumK(int[] nums) {
       int max=0;
        for(int x:nums){
            max=Math.max(max,x);
        }

        int low=1;
        int high=max+nums.length;
        int ans=max;
        while(low<=high){
            int k=low+(high-low)/2;
            
            long ops=0;
            
            for(int x:nums){
                ops+=(x+k-1)/k;
                if(ops>(long)k*k) break;
            }

            if(ops<=(long)k*k){
                ans=k;
                high=k-1;
            }else{
                low=k+1;
            }
        }
        return ans;
    }
}