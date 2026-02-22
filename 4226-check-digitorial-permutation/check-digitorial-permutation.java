class Solution {
    public boolean isDigitorialPermutation(int n) {
        String sort= sortString(String.valueOf(n));
        String[] arr = {"1", "2", "145", "40585"};
        for (String num : arr) {
            if (sort.equals(sortString(num))) {
                return true;
            }
        }
        return false;
    }
    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}