class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=0;
        int time=0;

        for(int floor : requests){
            time+=Math.abs(floor - ans);
            ans=floor;
        }

        return time;
    }
}