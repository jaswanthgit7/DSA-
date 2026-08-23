class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
     
     Arrays.sort(nums);
     List<List<Integer>> res=new ArrayList<>();
     int nex=lower;
     for(int num:nums){
        if(num<lower)
        continue;
        if(num>upper)
        break;
        if(nex<num){
            
            res.add(Arrays.asList(nex,num-1));
        }
        nex=num+1;
     }
     if(nex<=upper){
        res.add(Arrays.asList(nex,upper));
     }
     return res;
    }
}