class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    /*
        Understand : problem wants to group words with same letters together    
        naive solution would be to take a word and check all it's letters against the other words
        //first check will be length
        //second check, that is the word is an alphabet, then group it singularly
        
        Match:
        // the hashtable will store the hash(unique combination of 0's and 1's obatined from 
        character array) for each string 
        //the hash values that match will get stored corresponding to the hash value
        
        //Plan : 
        //handling the empty array
        //for loop for determining the hash value and storing it in the hashmap
        */
        
        List<List<String>> res = new ArrayList<>();
        
        if(strs.length==0) return res;
        
        HashMap<String, List<String>> map = new HashMap();
        
        for(String s: strs){
            
            //everytime a new character array will be initialized and we will store the frequency 
            //of the character in the array for a given string
            char[] hash = new char[26];
            
            for(char c: s.toCharArray()){
                hash[c-'a']++;
            }
            
            //converting character array into string, storing it like a combination of 0's and 1's
            String str=new String(hash);
            
            //if this is the first unique string
            if(map.get(str)==null){
                map.put(str, new ArrayList<>());
            }
            
            map.get(str).add(s);
        }
        
        res.addAll(map.values());
        
        return res;
        
    }
}