class Solution {
    public String largestOddNumber(String num) {
        String res = "";
        int n = num.length();

        for (int i = 0; i < n; i++) {

            if ((num.charAt(i) - '0') % 2 == 1) {
                res = num.substring(0, i + 1);
            }

        }

        return res;
    }
}