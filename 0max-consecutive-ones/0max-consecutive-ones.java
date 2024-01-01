class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0, left = 0, right = 0;
        while (left < n && right < n) {
            while (left < n && nums[left] == 0)
                left++;
            right = left;
            while (right < n && nums[right] == 1)
                right++;
            max = Math.max(max, right - left);
            left = right;
        }
        return max;
    }
}