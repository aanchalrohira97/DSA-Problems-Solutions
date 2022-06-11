class Solution {
    public void reverseString(char[] s) {
        //array, empty array, single word
        char[] result= new char[s.length];
        int count = 0;
        for(int i=s.length-1;i>-1;i--)
        {
            result[count] = s[i];
            count++;
        }
        
        for(int i=0;i<result.length;i++)
        {
            s[i] = result[i];
        }
    }
}