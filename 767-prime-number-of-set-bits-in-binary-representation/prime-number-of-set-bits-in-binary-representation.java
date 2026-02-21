class Solution {
    public int countPrimeSetBits(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int count=0;
        for(int i=left;i<=right;i++){
            int cnt=0;
            String a=Integer.toBinaryString(i);
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='1')
                cnt++;
            }
            boolean flag=al.contains(cnt);
            if(flag==true)
            count++;
        }
        return count;
        
    }
}