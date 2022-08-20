class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int nums1len = nums1.length;
        int nums2len = nums2.length;
        List<Integer> result = new ArrayList<>();
        
        while(i<nums1len && j<nums2len){
            if(nums1[i]<nums2[j]){
                result.add(nums1[i]);
                i++;
            }
            else{
                result.add(nums2[j]);
                j++;
            }
        }
        
        while(i<nums1len){
            result.add(nums1[i]);
            i++;
        }
        
        while(j<nums2len){
          result.add(nums2[j]);
          j++;
        }
        
        int size = result.size();
        if(size%2==0){
            System.out.print(size);
            return (double)(result.get((size/2)-1)+result.get(size/2))/2;
        }
        
        return result.get(size/2);
    }
}


/*Understand : empty array either one, then return median - return 0;
               negative input numbers? assuming not there
               duplicate numbers in both the arrays? 
               
Match : 2 pointers, merge the two arrays

Plan: 1. merge the two arrays using 2 pointer approach
      2. then take the median 

*/