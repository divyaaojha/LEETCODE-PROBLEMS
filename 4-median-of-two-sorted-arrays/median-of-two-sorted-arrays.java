class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     

      
        //we do binary search on the smaller array,  otherwise
        // If cut1 has a large range → cut2 becomes unstable
        // If cut1 has a small range → cut2 stays controlled

        if (nums1.length > nums2.length) {
        //swap, and make n1 smaller
        // references gets chnages, so O(1). efficient
        int[] temp = nums1;
        nums1 = nums2;
        nums2 = temp;
          }
            int num1size = nums1.length;
       int num2size = nums2.length;
        int n = num1size + num2size; // total elements in both the arrays

       

       int low =0, high = num1size;
       int leftsize = (n+1)/2; // handles even and odd no of elements well

       while( low <= high){
        

        int cut1 = low + (high-low)/2;
        int cut2 = leftsize -cut1; // since leftsize = cut1+ cut2
        int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
        int r1 = (cut1 == num1size) ? Integer.MAX_VALUE : nums1[cut1];

        int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
        int r2 = (cut2 == num2size) ? Integer.MAX_VALUE : nums2[cut2];

        if( l1 <= r2 && l2 <= r1){
            // valid condition

            //if odd n 
            if(n %2 == 0){
                double median = (Math.max(l1, l2) + Math.min(r1,r2))/2.0;
                return median;
            }
            else{
                // even n 
                return Math.max(l1, l2);
            
            }
        }
        // invalid 
       else if(l1> r2){
            high = cut1-1;
        }
        else {
            low = cut1 +1;
        }
       }


       return -1;
       }
    
}