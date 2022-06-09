class Solution {
    public boolean isAnagram(String s, String t) {
        //understand : in case string is empty, alphanumeric
        //match : HashMap, HashSet
        
         /*
            a n a g r a m 
            n a g a r a m
         */
        //plan : 1. compare and negate the frequency from second string
        
        //implement:
            
        if (s.length() != t.length()) return false;
        
        int[] alphabets = new int[26];
        
        for(int i=0;i<s.length();i++){
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}