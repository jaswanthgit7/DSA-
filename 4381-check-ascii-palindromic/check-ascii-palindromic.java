class Solution {
    public boolean isPalindromic(String s) {
        int n=s.length(); 
        StringBuilder sb = new StringBuilder();
        String  bin=" ";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            bin=String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0');
            sb.append(bin);
        }
        String str=sb.toString();
        char arr[]=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}