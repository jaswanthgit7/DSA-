class Solution {
    public int prefixConnected(String[] words, int k) {
       Map<String , Integer> map = new HashMap<>();
       int ans = 0;

       for(String word : words){
        if(word.length() >= k){
            map.put(word.substring(0,k) , map.getOrDefault(word.substring(0,k),0) + 1);
        }
       }
       
       for(int val : map.values()){
        if(val >1){
            ans++;
        }
       }
       return ans;
    }
}