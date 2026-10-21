class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedarr = new int[m+n];
        int k =m+n-1;
        int ind1 =m-1; int ind2= n-1;
        while(k>=0 && ind1>=0 && ind2>=0){
            if(nums1[ind1] >= nums2[ind2]){
                mergedarr[k--]= nums1[ind1--];
            }
            else{
                mergedarr[k--]= nums2[ind2--];
            }
        }
        while(ind1>=0 && k>=0){
           mergedarr[k--]= nums1[ind1--]; 
        }
        while(ind2>=0 && k>=0){
             mergedarr[k--]= nums2[ind2--]; 
        }

        int mid = (m+n)/2;
        //find median now,
        if((m+n) % 2 ==0){
            
            int a = mergedarr[mid];
            int b = mergedarr[mid-1];
            return (a+b)/2.0;
        }

        return mergedarr[mid];
    }
}