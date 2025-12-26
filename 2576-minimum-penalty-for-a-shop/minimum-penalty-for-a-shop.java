class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int pen=0;
        int best=0;
        int ans = 0;
        char[] ch=customers.toCharArray();
        for(int i=0;i<n;i++) {
            if(ch[i]=='Y') {
                pen--;
                if(pen<best) {
                    best=pen;
                    ans=i+1;
                }
            }
            else pen++;
        }
        return ans;
    }
}