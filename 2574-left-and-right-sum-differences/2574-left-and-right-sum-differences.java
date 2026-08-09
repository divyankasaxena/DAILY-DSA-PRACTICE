class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(sum - leftSum - nums[i]);
            leftSum += nums[i];
            sum -= nums[i];
        }

        return answer;
    }
}