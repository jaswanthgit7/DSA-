class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 0;
        for (String x : events) {
            if (x.equalsIgnoreCase("W")) {
                ans[1]++;
            } else if (x.equalsIgnoreCase("WD") || x.equalsIgnoreCase("NB")) {
                ans[0]++;
            } else {
                ans[0] = ans[0] + (int) (x.charAt(0) - '0');
            }
            if(ans[1]==10)
            {
                break;
            }
        }
        return ans;
    }
}