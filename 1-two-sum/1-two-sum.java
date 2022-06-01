class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];
       HashMap<Integer, Integer> record = new HashMap<>();
       
      for(int i=0;i<nums.length;i++){
      Integer compare = target -  nums[i];
          if(record.containsKey(compare)){
              result[0] = i;
              result[1] = record.get(compare);
          }
           else {
               record.put(nums[i],i);
           }
        }
        return result;
    }
}