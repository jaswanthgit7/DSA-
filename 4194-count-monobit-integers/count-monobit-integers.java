class Solution {
    public int countMonobit(int n) {
        int res=0;
        for(int i=0;i<=n;i++){
            int a=i;
            int b=a%2;
            while(a!=0){
                if(a%2!=b) break;
                a/=2;
            }
            if(a==0) res++;
        }
        return res;
    }
}