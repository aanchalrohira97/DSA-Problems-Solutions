class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> res = new HashMap<>();
        //the HashMap stores values as Entry object, consisting of key and value
        
        for(int i=0;i<nums.length;i++)
        {
   res.put(nums[i],
                   res.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> output = new ArrayList<>();
        
       //store in a priority queue 
        //this removes the time for sorting, that is n log n
        
        //declaring priority queue
       PriorityQueue<Map.Entry<Integer,
                                Integer>> queue
            = new PriorityQueue<>(
                (a, b)
                -> a.getValue().equals(b.getValue())
                   ? Integer.compare(b.getKey(),
                                     a.getKey())
                   : Integer.compare(b.getValue(),
                                     a.getValue()));
        
        //storing map into priority queue
        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            queue.offer(entry);
        }
        
        int arr[] = new int[k];
       for(int i = k - 1; i >= 0; --i) {
            arr[i] = queue.poll().getKey();
        }
        
        
        return arr;
    }
}