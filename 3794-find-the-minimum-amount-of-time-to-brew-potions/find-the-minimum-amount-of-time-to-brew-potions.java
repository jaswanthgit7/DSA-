class Solution {
    public long minTime(int[] skill, int[] mana) {
    int n=skill.length;
    long[] endt=new long[n];
    Arrays.fill(endt,0);
    for(int i=0;i<mana.length;++i){
        long t=0,maxDiff=0;
        for(int j=0;j<skill.length;++j){
            maxDiff=Math.max(maxDiff,endt[j]-t);
            t+=(long)skill[j]*(long)mana[i];
            endt[j]=t;
        }
        for(int j=0;j<n;++j)
            endt[j]+=maxDiff;
    }
    return endt[endt.length-1];
}
        
}