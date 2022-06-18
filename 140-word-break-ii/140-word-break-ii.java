class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        backtrack(res,s,wordDict, new ArrayList<>(), 0);
        return res;
    }
    private void backtrack(List<String> res,String s, List<String> wordDict, List<String> current, int idx){
        if(idx == s.length()){
            res.add(buildString(current));
        }
        for(String word : wordDict){
            int len = word.length();
            if(idx + len > s.length()) continue;
            String substring = s.substring(idx, idx + len);
            if(word.equals(substring)){
                current.add(word);
                backtrack(res,s,wordDict, current, idx + len);
                current.remove(current.size() - 1);
            }
        }
    }
    private String buildString(List<String> list){
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s).append(" ");
        }
        if(sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}