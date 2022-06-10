class Solution {
    public int romanToInt(String s) {
        
        
        Map<Character, Integer> dictionary = new HashMap<>();
        
        dictionary.put('I',1);
        dictionary.put('V',5);
        dictionary.put('X',10);
        dictionary.put('L',50);
        dictionary.put('C',100);
        dictionary.put('D',500);
        dictionary.put('M',1000);
        
        int value = 0;
        
       for(int i = 0; i<s.length()-1;i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            if (dictionary.get(a) < dictionary.get(b)) {
                value -= dictionary.get(a);
            } else {
                value += dictionary.get(a);
            }
        }
        
        return value + dictionary.get(s.charAt(s.length()-1));
        
        
    }
}