class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> seen = new HashSet<>();
        
        while(!seen.contains(n) && n!=1){
            seen.add(n);
            n = isTotal(n);
        }
        
        return n == 1;
    }
    
    public int isTotal(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum = sum + (d * d);
        }
        return sum;
    }
    
}