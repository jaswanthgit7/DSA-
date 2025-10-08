class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length(); 
        int[] arrBox=new int[n];
        for(int i=0; i<n; i++){
            arrBox[i]=boxes.charAt(i)-'0';
        }
        int[] left=new int[n]; 
        int[] right=new int[n]; 
        int count=0;
        count=arrBox[0];
        for(int i=1; i<n; i++){
            left[i]=left[i-1]+count;
            count+=arrBox[i];
        }  
        count=arrBox[n-1];
        for(int i=n-2; i>=0; i--){
            right[i]=right[i+1]+count;
            count+=arrBox[i];
        }
        for(int i=0; i<n; i++){
            arrBox[i]=left[i]+right[i];
        }        

        return arrBox;
    }
}