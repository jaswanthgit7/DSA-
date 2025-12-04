class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int last=0;
        for(int lefty:left) {
            last=Math.max(last, lefty);
        }
        for (int righty : right) {
            last= Math.max(last, n - righty);
        }
        
        return last;
    }
}