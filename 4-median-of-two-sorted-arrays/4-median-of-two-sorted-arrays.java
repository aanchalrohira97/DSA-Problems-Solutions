class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
         if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int low = 0;
        int high = nums1.length;
        int nums1len = nums1.length;
        int nums2len = nums2.length;
        
        
        while(low <=high){
            
            int cut1 = low + (high-low)/2;
            int cut2 = ((nums1len + nums2len)/2) - cut1;
            
            int l1 = (cut1 == 0)? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = (cut2 == 0)? Integer.MIN_VALUE : nums2[cut2-1];
            
            int r1 = (cut1 == nums1len)? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == nums2len)? Integer.MAX_VALUE : nums2[cut2];
            
            if(l1 > r2){
                high = cut1-1;
            }
            else if(l2 > r1){
                low = cut1 +1;
            }
            else
            {
                if((nums1len + nums2len)%2 == 0){
                   return (double)(Math.max(l1,l2) + Math.min(r1,r2))/2; 
                }
                else{
                 return (double)Math.min(r1,r2);
                }
            }
        }
        
      return 0;
    }
    
}


/*Understand : empty array either one, then return median - return 0;
               negative input numbers? assuming not there
               duplicate numbers in both the arrays? 
               
Match : 2 pointers, merge the two arrays

Plan: 1. merge the two arrays using 2 pointer approach
      2. then take the median 

but, time complexity is log(m+n), that means, we use binary search here

step1 : is to get left and right partition done correctly
step2 : based on the total length of the elements, median will either be an element or sum of two elements divided by 2.

*/