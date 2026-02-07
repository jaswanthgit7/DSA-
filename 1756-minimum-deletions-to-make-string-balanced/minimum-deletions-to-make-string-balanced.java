class Solution {
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        int tot = 0;

        for (char c : chars) {
            if (c == 'b') {
                tot++;
            } else {
                if (tot > 0) {
                    cnt++; 
                    tot--;
                }
            }
        }

        return cnt;
    }
}