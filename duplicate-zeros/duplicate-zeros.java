class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        for(int i=0; i<arr.length;i++)
        {
            arr2.add(arr[i]);
            if(arr[i] == 0)
            {
                arr2.add(0);
            }
        }
        
        int i=0;
        while(i<arr.length)
        {
            arr[i] = arr2.get(i);
            i++;
        }
        
    }
}