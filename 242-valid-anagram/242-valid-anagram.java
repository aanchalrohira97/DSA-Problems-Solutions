class Solution {
    public boolean isAnagram(String s, String t) {
        //understand : in case string is empty, alphanumeric
        //match : HashMap, HashSet
        
         /*
            a n a g r a m 
            n a g a r a m
         */
        //plan : 1. compare and negate the frequency from second string
        
        //implement: taking HashMap, add all alphabets that exist with their freq
                //: in the second loop, remove them from the hashmap if frequency reaches 0
            
        if (s.length() != t.length()) return false;
        
      
        Map<Character, Integer> freq = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            int value = freq.getOrDefault(s.charAt(i),0);
            freq.put(s.charAt(i),value+1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            int value = freq.getOrDefault(t.charAt(i),0);
            freq.put(t.charAt(i),value-1);
            if(freq.get(t.charAt(i))==0) freq.remove(t.charAt(i));
        }
        
        return freq.isEmpty();
    }
}