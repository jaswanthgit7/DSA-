class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = 0;
        for (int light : lights) {
            max = Math.max(light, max);
        }
        int wait = 0;
        for (int t : arrivalTime) {
            int r = t % period;
            if (r >= max) {
                int time = period - r;
                wait = Math.max(wait, time);
            }
        }
        return wait;
    }
}