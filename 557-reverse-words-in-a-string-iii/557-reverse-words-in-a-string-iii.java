class Solution {
   
       public String reverseWords(String s) {
        
        int lastIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();
           
        for(int startIndex = 0; startIndex<=len;startIndex++){
            if(startIndex==len || chArray[startIndex]==' '){
                int strtIndex = lastIndex + 1;
                int endIndex = startIndex - 1;
                while(strtIndex < endIndex){
                    char t = chArray[strtIndex];
                    chArray[strtIndex] = chArray[endIndex];
                    chArray[endIndex] = t;
                    endIndex--;
                    strtIndex++;
                }
              lastIndex = startIndex;
            }
        }
    return new String(chArray);
 }
}

/*
    split the string at white space
    pass each word to the helper function and then return the same back to append 
    to the original string
    
    the above approach is more tedious thus we need to use pointers implementing the same concept
    
*/