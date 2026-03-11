class Solution {
    public int bitwiseComplement(int n) {
        String str= Integer.toBinaryString(n);
        StringBuilder str1= new StringBuilder();;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                str1.append('1');
            }else{
                str1.append('0');
            }
        } 
        int res= Integer.parseInt(str1.toString(),2);
        return res;
    }
}