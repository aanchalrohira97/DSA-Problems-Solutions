class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> permuts = new ArrayList<>();
        Set<Integer> permut = new LinkedHashSet<>();
        permutation(nums,permuts,permut);
        return permuts;
    }
    
    public void permutation(int[] nums,List<List<Integer>> permuts,Set<Integer> permut){
        
        if(nums.length == permut.size()){
            permuts.add(new ArrayList<>(permut));
        }
        
        for(int i=0; i<nums.length;i++){
            if(permut.contains(nums[i])){
                continue;
            }
            
            permut.add(nums[i]);
            permutation(nums,permuts,permut);
            permut.remove(nums[i]);
        }
        
    }
}