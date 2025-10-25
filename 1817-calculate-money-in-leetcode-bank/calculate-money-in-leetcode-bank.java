class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int m=1,c=1;
        for (int i=0;i<n;i++) {
            ans +=c;
            c=c+1;
            if((i+1)%7==0) {
                c=++m;
            }
        }
        return ans;
    }
}