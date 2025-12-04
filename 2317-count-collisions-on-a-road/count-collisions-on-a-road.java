class Solution {
    public int countCollisions(String directions) {
        int n=directions.length();
        int i=0;
        int j=n-1;
        while(i<n&&directions.charAt(i)=='L')
        i++;
        while(j>=i&&directions.charAt(j)=='R')
        j--;
        int cnt=0;
        for(int k=i;k<=j;k++) {
            if(directions.charAt(k)=='L'||directions.charAt(k)=='R')
            cnt++;
        }
        return cnt;
    }
}