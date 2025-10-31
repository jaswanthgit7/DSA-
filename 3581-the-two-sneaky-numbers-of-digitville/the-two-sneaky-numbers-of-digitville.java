class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    arr[cnt]=nums[i];
                    cnt++;
                }
            }
        }
        return arr;
    }
}