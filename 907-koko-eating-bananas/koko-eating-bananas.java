class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(helper(piles,h,mid)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }


    private static boolean helper(int [] piles,int hrs,int k){
        int hrReq = 0;

        for(int val : piles){
            if(val%k != 0){
                hrReq += (val/k)+1;
            }
            else{
                hrReq += val/k;
            }
        }
        return hrReq <= hrs;
    }
}