class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        boolean check[]=new boolean[nums.size()];
        int i,j;
        for(i=0;i<nums.size()-k+1;i++){
            for(j=i+1;j<k+i;j++){
                if(nums.get(j)<=nums.get(j-1)){
                    break;
                }
            }
            if(j==k+i){
                check[i]=true;
            }
        }
        for(i=0;i<check.length-k;i++){
            if(check[i]&&check[i+k]){
                return true;
            }
        }
        return false;
    }
}