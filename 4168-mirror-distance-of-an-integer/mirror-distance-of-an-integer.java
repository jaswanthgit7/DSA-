class Solution {
    public int mirrorDistance(int n) {
        int x=n;
        int y=0;
        while(n>0){
            y=y*10+(n%10);
            n/=10;
        }
        return Math.abs(x-y);
        
    }
}