class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for (String word : words){
            long sum=0;
            for (char ch:word.toCharArray()) {
                sum+=weights[ch - 'a'];
            }
            int rem=(int)(sum % 26);
            res.append((char)('z' - rem));
        }

        return res.toString();
    }
}