class Solution {
    public int largestInteger(int n, int s) {
        if(s == 0)
         return 0;
        if(n*9 < s)
         return -1;
        int ans = 0;
        for(int i = 1;i <= n;i++){
            if(s >= 9){
                ans += 9;
                s -= 9;
            }
            else if(s == 8){
                ans += 8;
                s -= 8;
            }
            else if(s == 7){
                ans += 7;
                s -= 7;
            }
            else if(s == 6){
                ans += 6;
                s -= 6;
            }
            else if(s == 5){
                ans += 5;
                s -= 5;
            }
            else if(s == 4){
                ans += 4;
                s -= 4;
            }
            else if(s == 3){
                ans += 3;
                s -= 3;
            }
            else if(s == 2){
                s -= 2;
                ans += 2;
            }
            else if(s == 1){
                s -= 1;
                ans += 1;
            }
            if(i == n) continue;
            ans *= 10;
        }
        return ans;
    }
}