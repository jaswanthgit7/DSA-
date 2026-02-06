class Solution {
    public String shortestPalindrome(String s) {
    int j = 0;
    int n=s.length();
    for (int i = n - 1; i >= 0; i--) {
        if (s.charAt(i)==s.charAt(j)){
             j++;
             }
    }
    if (j == s.length()) {
         return s; 
        }
    String suffix = s.substring(j);
    return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
        
    }
}