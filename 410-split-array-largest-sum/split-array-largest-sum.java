class Solution {
    public boolean check(int[] nums,int k,int x)
    {
        int n=nums.length,c=1,s=0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
            if(s>x)
            {
                s=nums[i];
                c++;
            }
        }
        if(c<=k)return true;
        else return false;
    }
    public int splitArray(int[] nums, int k) {
        int max=nums[0],sum=0;
        for(int a:nums)
        {

            sum+=a;
            if(max<a)
            max=a;
        }
        int low=max,high=sum;
        while(low<=high)
        {
            int mid=low +(high-low)/2;
            if(check(nums,k,mid))
            high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}