class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Node root = new Node();
        for (String word : wordDict)
            addWord(word, root);
        return wordBreak(s, 0, new HashMap<>(), root);
    }
    
    public void addWord(String word, Node root) {
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!root.map.containsKey(c))
                root.map.put(c, new Node());
            root = root.map.get(c);
        }
        root.end = true;
    }
    
    public List<String> wordBreak(String s, int index, Map<Integer, List<String>> dp, Node root) {
        if (index == s.length()) {
            return Collections.emptyList();
        }
        
        if (dp.containsKey(index)) {
            return dp.get(index);
        }
        
        Node curr = root;
        for(int i = index; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!curr.map.containsKey(c))
                break;
            if (curr.map.get(c).end) {
                List<String> out = wordBreak(s, i + 1, dp, root);
                List<String> result = dp.getOrDefault(index, new ArrayList<>());
                String sub = s.substring(index, i + 1);
                if (i + 1 == s.length())
                    result.add(sub);
                else
                    for (String o : out)
                        result.add(sub + " " + o);
                dp.put(index, result);
            }
            curr = curr.map.get(c);
        }
        return dp.getOrDefault(index, new ArrayList<>());
    }
    
    
    public static class Node {
        Map<Character, Node> map = new HashMap<>();
        boolean end = false;
    }
}