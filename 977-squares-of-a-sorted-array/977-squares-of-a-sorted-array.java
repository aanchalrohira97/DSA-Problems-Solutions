class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length -1;
        List<Integer> results = new ArrayList<>();
        
        while(left<=right)
        {
            if(nums[left]<0){
                if((-1*nums[left])<nums[right]){
                     results.add(nums[right]*nums[right]);
                    right--;
                }
                else
                {
                    results.add(nums[left]*nums[left]);
                    left++;
                }
            }
            else
            {
                if(nums[left]<nums[right]){
                     results.add(nums[right]*nums[right]);
                    right--;
                   
                }
                else
                {
                  results.add(nums[left]*nums[left]);
                    left++;
                }
            }
            
        }
        
        Collections.reverse(results);
        return results.stream().mapToInt(i -> i).toArray();
        
    }
}

/*

step 1: two pointers, going left, going right
step 2: compare magnitude, store the new value in array 
*/