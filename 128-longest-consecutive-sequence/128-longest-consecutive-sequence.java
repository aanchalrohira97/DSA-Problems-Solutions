class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        if(nums.length == 0){
            return 0;
        }
        
        for(int n: nums){
            set.add(n);
        }
        
        int max = 1;
        
        for(int n:nums){
            
            if(set.contains(n) && !set.contains(n-1)){
                int right = n;
                int currentmax = 1;
                while(set.contains(right+1)){
                    set.remove(right);
                    right++;
                    currentmax = currentmax + 1;
                }
            
                if(max<currentmax){
                    max = currentmax;
                }
            
            }
            
        }
        
        return max;
    }
}