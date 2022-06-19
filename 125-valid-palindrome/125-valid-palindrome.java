class Solution {
    public boolean isPalindrome(String s) {
        
         if(s == null){
            return false;
        }
        
        ArrayList<Character> toCheck = new ArrayList<>();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if((c>='A'&&c<='Z') || (c>='a'&&c<='z') || (c>='0'&&c<='9')){
                toCheck.add(s.charAt(i));
            }  
        }
        
        int i=0;
        int j=toCheck.size()-1;
        
        while(i<j && i!=j){
            
            if(toCheck.get(i) == toCheck.get(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}