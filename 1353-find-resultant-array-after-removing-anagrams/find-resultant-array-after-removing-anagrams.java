class Solution {
    public List<String> removeAnagrams(String[] words) {
         List<String> res=new ArrayList<>();
         for (String word:words) {
            if (!res.isEmpty()&&isAnagram(res.get(res.size()-1),word)) {
                continue;
            }
            res.add(word);
        }
        
        return res;
    }
    private boolean isAnagram(String a, String b) {
        if (a.length()!=b.length())
        return false;
        char[] ca=a.toCharArray();
        char[] cb=b.toCharArray();
        Arrays.sort(ca); 
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
        
    }

}