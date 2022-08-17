class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length -1;
        int i = nums.length -1;
        int[] result = new int[nums.length];
        
        while(left<=right)
        {
           int prod1 = nums[left] * nums[left];
           int prod2 = nums[right] * nums[right];
            
           if(prod1>prod2){
                  result[i--] =  prod1; 
                  left++;
           }
            else{
                result[i--] =  prod2; 
                right--;
            }
             
        }
        
        return result;
        
    }
}

/*

step 1: two pointers, going left, going right
step 2: compare magnitude, store the new value in array 
*/