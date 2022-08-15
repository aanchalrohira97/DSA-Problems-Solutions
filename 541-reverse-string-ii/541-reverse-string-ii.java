class Solution {
    public String reverseStr(String s, int k) {
        
        char[] words = s.toCharArray();
        for(int i = 0; i<words.length; i = i+(2*k)){
            if(i + k > words.length){
                helper(i, words.length-1, words);
                break;
            }
            helper(i, i+k-1,words);
        }
        
        return new String(words);
    }
    
    public void helper(int i, int j, char tempArray[]){
         while(i<j){
            char t = tempArray[i];
            tempArray[i] = tempArray[j];
            tempArray[j] = t;
            i++;
            j--;
        }
    }
}

/*
understand: input : if s = null, return null
                    if k = 0, return same string
                    
match : store it in a character array and then manipulate it, because for a string every mutation creates a new instance of the string

plan : 1. transform string into a character array
       2. two indexes, one pointing at the beginning and second at the end
       3. swap the values until one index remains, when indexes are odd
       4. no indexes remain, when size is even
*/