class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min = nums[0];
        int max = nums[n- 1];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        List<Integer> arr = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                arr.add(i);
            }
        }
        return arr;
    }
}
