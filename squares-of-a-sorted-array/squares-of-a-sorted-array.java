class Solution {
    public int[] sortedSquares(int[] nums) {
        //TC: O(nlogn)
        //SC: O(1)
        //for loop - find squares of all the number
         for(int i=0;i<nums.length; i++) //O(n)
        {
            nums[i] = nums[i]*nums[i];
        }
        
        //sort the array the final array
        Arrays.sort(nums); //O(nlogn)

        return nums;
    }
}