class Solution {
    public int countValidPrefixes(String s) {
        int cnt0 = 0;
        int cnt1 = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                cnt0++;
            }
            else{
                cnt1++;
            }
            int diff = Math.abs(cnt0-cnt1);
            if(diff == 1 || diff== 0){
                ans++;
            }
        }
        return ans;
    }
}