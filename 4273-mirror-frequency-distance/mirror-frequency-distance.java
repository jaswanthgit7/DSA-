class Solution {
    public int mirrorFrequency(String s) {
        int n = s.length();
        int[] f = new int[128];
        for (int i = 0; i < n; i++) {
            f[s.charAt(i)]++;
        }
        int ans = 0;
        for (int i = 0; i < 13; i++) {
            if(i<5){ 
                ans+=Math.abs(f[48+i]-f[57-i]);
            }
            ans+=Math.abs(f[97+i]-f[122-i]);
        }
        return ans;
    }
}