class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer,Integer> hm= new HashMap<>();
        int [] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            int val = 0;
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            hm.put(B[i],hm.getOrDefault(B[i],0)+1);
            for(Map.Entry<Integer,Integer> entry :hm.entrySet()){
                if(entry.getValue()%2==0){
                    val++;
                }
            }

            res[i] = val;
        }
        return res;
    }
}   