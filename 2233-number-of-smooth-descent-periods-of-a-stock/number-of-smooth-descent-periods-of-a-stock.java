class Solution {
    public long getDescentPeriods(int[] prices) {
        int ans=0;
        int n=prices.length;
        long count=0;
        
        for(int i=0;i<n;i++) {
            
            if(i> 0 && prices[i-1] != prices[i]+1)
                ans=i;
            
            count += i-ans+1;
        }
        return count;
    }
}