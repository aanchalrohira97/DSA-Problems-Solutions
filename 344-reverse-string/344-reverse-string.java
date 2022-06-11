class Solution {
    public void reverseString(char[] s) {
        //array, empty array, single word
        //char[] word = s.toCharArray();
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    }
}