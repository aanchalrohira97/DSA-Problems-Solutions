class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Understand : empty array?
        //Match : HashTable to get frequency
        //Plan : take the frequency, already exists then return true
        //Implement 
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i]))
            {
                return true;
            }
            else{
                freq.put(nums[i],1);
            }
        }
        return false;
    }
}