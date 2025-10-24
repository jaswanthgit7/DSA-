class Solution {
    public int longestBalanced(int[] nums) {
        int ans=0;
        int n=nums.length;
        for (int i=0;i<n - 1;i++) {
            Set<Integer> odd=new HashSet<>();
            Set<Integer> even=new HashSet<>();
            if (nums[i]%2==0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
            for (int j=i+1;j<n;j++) {
                if (nums[j]%2==0) {
                    even.add(nums[j]);
                } else {
                    odd.add(nums[j]);
                }
                if(odd.size()==even.size())
                {
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}