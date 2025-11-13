class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int tCount =0;
        int fCount =0;

        int ans =0; 
        int n = s.length();

        for(int i=0, j=0; i< n; i++) {
            char c = s.charAt(i);
            if(c == 'T') {
                tCount++;
            }
            else if(c == 'F'){
                fCount++;
            }
            int currAllowed = Math.min(tCount, fCount);
            while(currAllowed > k) {
                char ch = s.charAt(j);
                if(ch == 'T') {
                    tCount--;
                }
                else if(ch == 'F') {
                    fCount--;
                }
                j++;
                currAllowed = Math.min(tCount, fCount);
            }
            ans = Math.max(ans, i- j +1);
        }
        return ans;
    }
}