class Solution {
    public int maxDistinct(String s) {
        int[] f = new int[26];
        int len = s.length();
        int ans = 0;
        for(int i = 0; i < len; ++i)
            if(f[s.charAt(i) - 'a']++ == 0)
            ++ans;
        return ans;
    }
}