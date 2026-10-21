class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    /* we will try to make a virtual boundary separating left  and right halves(left half to nums 1 smaller tan all right haf ele of num2, and all all left half ele of nums2 smaller than right half of nums1).
    so, also to put boundaruy we need to traverse only over one sorted array, so naturally to optimise the solution further, we ll make sure that we do binary search ove rthe smaller one 
     */

     //made sure that nums1 is smaller array
     if(nums1.length > nums2.length){
        int[] temp = nums1;
        nums1=nums2;
        nums2=temp;
     }
     int m = nums1.length;
     int n = nums2.length;

     //range of binary search over nums1
     int low =0; int high = m; // this is m and not m-1, because  no ofplaces we can cuts an array of 3 ele  is , 0, or 1, or 2, or 3(i.e 4)
     while(low <= high ){
        //mid value of range in nums1
        int i = low + (high-low)/2; //i.e nums1-has number of ele on left parttion - i elements, so remainung ele that the nums2 can have on its left side are [ ((m+n+1)/2) -i ] 

        //+1 is to handle the odd number of ele- to make sure one extra ele goes to the left partition
        int j = ((m+n+1)/2) - i;

        //now putting values on the left right boundaries
        int left1= (i==0)?Integer.MIN_VALUE : nums1[i-1];
        int right1= (i==m)?Integer.MAX_VALUE : nums1[i];

        int left2= (j==0)?Integer.MIN_VALUE : nums2[j-1];
        int right2= (j==n)?Integer.MAX_VALUE : nums2[j];

        //now checking if partitions are valid or not, if not tweaking the range of binary search
        if(left1 <= right2 && left2 <= right1){
            //boundaries perfect

            //now to find the median and return
            //odd total length
            if((m+n)%2==1 ){
                return Math.max(left1, left2);
            }

            //if even length
            int leftmax= Math.max(left1, left2);
            int rightmin= Math.min(right1, right2);
            //these 2 are the middle ele, now find avg and return- that is the miedian
            return ((double)leftmax + rightmin)/2.0;

        }

        else if(left1 > right2){
            //we took extra element on left size, so
            high = i-1; // moved boundary backwards

        }

        else{
            //i.e. left2 > right1, we took very few ele on the left of nums1, 
            low = i+1; // moved boundary forward, 
        }

     }
     return 0;


        // int m = nums1.length;
        // int n = nums2.length;
        // int[] mergedarr = new int[m+n];
        // int k =m+n-1;
        // int ind1 =m-1; int ind2= n-1;
        // while(k>=0 && ind1>=0 && ind2>=0){
        //     if(nums1[ind1] >= nums2[ind2]){
        //         mergedarr[k--]= nums1[ind1--];
        //     }
        //     else{
        //         mergedarr[k--]= nums2[ind2--];
        //     }
        // }
        // while(ind1>=0 && k>=0){
        //    mergedarr[k--]= nums1[ind1--]; 
        // }
        // while(ind2>=0 && k>=0){
        //      mergedarr[k--]= nums2[ind2--]; 
        // }

        // int mid = (m+n)/2;
        // //find median now,
        // if((m+n) % 2 ==0){
            
        //     int a = mergedarr[mid];
        //     int b = mergedarr[mid-1];
        //     return (a+b)/2.0;
        // }

        // return mergedarr[mid];
    }
}