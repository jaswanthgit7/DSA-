class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int maxi=Integer.MIN_VALUE;
        int n=energy.length;
        for (int i=0;i<k;i++) {
            int sum=0; 
            for (int j=n-1;j-i>=0;j-=k) {
                sum+=energy[j-i];       
                maxi=Math.max(sum, maxi);   
            }
        }

        return maxi;
    }
}