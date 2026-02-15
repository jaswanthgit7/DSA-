class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums)
            m.put(n, m.getOrDefault(n, 0) + 1);
        
        Map<Integer, Integer> f = new HashMap<>();
        for(int n : m.values())
            f.put(n, f.getOrDefault(n, 0) + 1);
        
        for(int n : nums)
            if(f.get(m.get(n)) == 1) return n;
        
        return -1;
    }
}