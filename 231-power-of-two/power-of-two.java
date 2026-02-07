class Solution{
public boolean isPowerOfTwo(int n) {
        while(n!=1){
            int r=n%2; 
            n=n/2;
            if(r!=0) 
            return false;
            if(n==0)
             return false;
        }
        return true;
    }
}