class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = Integer.MIN_VALUE;
        
        int i= 0;
        int curr_count = 0;
        
        while(i<nums.length)
        {
            if(nums[i] == 0)
            {
                count = Math.max(curr_count, count);
                curr_count = 0;
            }
            else
            {
                curr_count++;
            }
            i++;
            
                count = Math.max(curr_count, count);
        }
        
        return count;
    }
}