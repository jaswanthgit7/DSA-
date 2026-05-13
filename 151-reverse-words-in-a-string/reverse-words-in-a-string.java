class Solution {
    public String reverseWords(String s) {
        String[] u=s.trim().split("\\s+");
        String h="";
        for(int i=u.length-1;i>=0;i--){
            h=h+u[i];
            if(i!=0){
                h=h+" ";
            }
        }
        return h;
   }
}