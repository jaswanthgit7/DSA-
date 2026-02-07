class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        int max=0;
        int avail=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='['){
                avail--;
            }
            else if(s.charAt(i)==']'){
                avail++;
            }
            max=Math.max(max,avail);
            
        }
        return (max+1)/2;

    }
}