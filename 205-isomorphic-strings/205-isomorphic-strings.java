class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();
        
        Map<Character, Character> result = new HashMap<>();
        
        
        //take care of s to t mapping and t to s mapping
        
        //b b
        //a a
        //
        for(int i=0;i<s.length();i++)
        {
            if(result.containsKey(s.charAt(i)))
            {
                if(result.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else if(result.containsValue(t.charAt(i)))
                    {
                        return false;
                    }
            else{
                result.put(s.charAt(i),t.charAt(i));
            }
        }
        
        return true;
    }
}