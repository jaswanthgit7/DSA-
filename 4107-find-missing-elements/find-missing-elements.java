class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            int dif=nums[i]-nums[i-1];
            for(int j=1;j<dif;j++){
                temp.add(nums[i-1]+j);
            }
        }
        return temp;
        
        
    }
}