class Solution {
    public int numberOfSubstrings(String s, int k) {
        HashMap<Character, Integer> map= new HashMap<>();
        int n = s.length();
        int low = 0;
        int count = 0;
        for(int high=0; high < n; high++) {
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            while(map.containsKey(s.charAt(high))&&map.get(s.charAt(high)) == k) {
                count += n - high;
                map.put(s.charAt(low),map.get(s.charAt(low)) - 1);
                
                if(map.get(s.charAt(low))== 0) {
                    map.remove(s.charAt(low));
                }
                low++;
            }
        }
        return count;
    }
}