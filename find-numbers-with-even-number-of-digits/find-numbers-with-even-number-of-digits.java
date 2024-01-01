class Solution {
    public int findNumbers(int[] nums) {
        
        // 12/10 = 1
        // 1/10 = 0
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            int temp = nums[i];
            int temp_c = 0;
            
            while(temp > 0)
            {
                temp = temp/10;
                temp_c+=1;
            }
            
            if(temp_c%2 == 0) count+=1;
            
        }
        
        return count;
    }
}