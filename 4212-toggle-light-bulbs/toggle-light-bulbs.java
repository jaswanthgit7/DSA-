class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
          boolean[] arr = new boolean[101];

        for (int i : bulbs) {
            arr[i] = !arr[i];
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (arr[i]) ans.add(i);
        }

        return ans;
        
    }
}