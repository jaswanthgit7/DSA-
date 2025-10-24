class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs=new HashSet<>();
        for (int n:nums)
        hs.add(n);
        int i=1;
        while(true){
            if (i%k==0&&!hs.contains(i))
            return i;
            i++;
        }
    }
}