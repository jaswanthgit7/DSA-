class Solution {
    public long minNumberOfSeconds(int h, int[] arr) {

        long start=1;
        long end = (long) 1e18;
        long answer= end;

        while(start<=end){

            long mid = start + (end-start)/2;


            if(is_validTime(arr,h,mid)){
                answer = Math.min(answer,mid);
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return answer;
   
    }
    boolean is_validTime(int[] arr, int h ,long time){
        
        long curr =0;
        for(int i=0;i<arr.length;i++){

            long start = 1;
            long end = h;
            while(start<=end){

                long mid = start + (end-start)/2;

                long sum = (long)(mid*(mid+1))/2*arr[i];
                if(sum<=time) start = mid+1;
                else{
                    end = mid-1;
                }
            }

            curr+=end;
            if(curr>=h) return true;  
        }
        if(curr>=h) return true;
        return false;
    }
} 

    