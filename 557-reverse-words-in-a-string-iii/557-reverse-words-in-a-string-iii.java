class Solution {
   
       public String reverseWords(String s) {
        
       char[] rev = s.toCharArray();
        int i = 0;
        for(int j = 0; j < rev.length; j++){
            if(rev[j] == ' '){
                reverse(rev, i, j - 1);
                i = j + 1;
            }
        }
        reverse(rev, i, rev.length - 1);
        return new String(rev);
    }
    
    public void reverse(char[] rev, int i, int j){
        while(i <= j){
            char temp = rev[i];
            rev[i] = rev[j];
            rev[j] = temp;
            i++; j--;
        }
    } 
 }

/*
    split the string at white space
    pass each word to the helper function and then return the same back to append 
    to the original string
    
    the above approach is more tedious thus we need to use pointers implementing the same concept
    
*/