class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;

        int maxi = nums[0];
        long[] gcds = new long[n];
        gcds[0] = maxi;

        for(int i = 1; i < n; i++){
            maxi = Math.max(maxi, nums[i]);
            gcds[i] = gcd(maxi, nums[i]);
        }

        Arrays.sort(gcds);

        long sum = 0;
        int i = 0, j = n - 1;

        while(i < j){
            sum += gcd((int)gcds[i++], (int)gcds[j--]);
        }

        return sum;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}