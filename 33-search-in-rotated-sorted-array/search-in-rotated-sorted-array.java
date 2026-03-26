class Solution {
    public int search(int[] nums, int target) {
    
      // brute force - linear search
      // optimal- binary search - 0(log n)
        int n = nums.length;
        int left =0; int right =n-1;
        while(left <= right){

            int mid = left + (right-left)/2;

            if( nums[mid] == target){
                return mid;
            }

            // if left to mid is sorted half, then proceed with this
            if( nums[left] <=nums[mid]){
                if( nums[left] <= target && target < nums[mid]){
                    right =mid-1;
                }
                else{
                    left =mid+1;
                }
            }


            // if right to mid is sorted half, then proceed with this
            else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }

                else{
                    right = mid-1;
                }
            }
        }

return -1;
    }  
}