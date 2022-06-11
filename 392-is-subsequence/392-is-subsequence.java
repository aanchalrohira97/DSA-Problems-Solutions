class Solution {
    public boolean isSubsequence(String s, String t) {
        //abcde
        //ace
        boolean result = false;
       int count =0;
       
        if(s.isEmpty()){
            return true;
        }
        
        if(t.isEmpty()){
            return false;
        }
        
        for(int i=0;i<t.length();i++){
            if(count<s.length()){
            if(t.charAt(i)==s.charAt(count))
            {
                count++;
            }}
        }
        
        if(s.length()==count)
        {
            result=true;
        }
        
        return result;
    }
}