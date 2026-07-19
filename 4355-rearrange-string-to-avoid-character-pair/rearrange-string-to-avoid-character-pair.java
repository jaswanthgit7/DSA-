class Solution {
    public String rearrangeString(String s, char x, char y) {
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch==y){
                cnt++;
            }
        }
        s=s.replace(y+"","");
        while(cnt--!=0){
            s=y+s;
        }
        return s;
    }
}