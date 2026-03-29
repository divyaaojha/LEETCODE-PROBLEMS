class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l =0; int r =n-1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if(nums[mid]>= target){
                r= mid-1;
            }

            else{
                l = mid+1;
            }
        }

        return l;































        // int left =0;
        // int right = nums.length-1;
        // int index =0;
        
        // while(left<= right){
        //     int mid = left + (right-left)/2;
        //    if(nums[mid] == target ) {
        //     index =mid;
        //     return mid;
        //    }

        //    else if (nums[mid]< target){
        //     left= mid+1;
        //     index=left;
            
        //    }
        //    else{
        //     right = mid-1;
           
        //    }
        // }
        //  return index;
    }
}