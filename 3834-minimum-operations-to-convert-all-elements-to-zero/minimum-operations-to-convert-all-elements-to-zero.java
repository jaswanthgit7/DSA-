class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int num : nums){
            while(!stack.empty() && stack.peek() > num){
                stack.pop();
            }
            if(num == 0) continue;

            if(stack.empty() || stack.peek() < num){
                stack.push(num);
                result++;
            }
        }

        return result;
    }
}