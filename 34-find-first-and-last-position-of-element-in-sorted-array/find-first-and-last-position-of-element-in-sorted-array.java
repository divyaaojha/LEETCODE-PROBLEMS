class Solution {
    public int[] searchRange(int[] nums, int target) {
     int[] ans = new int[2];
     Arrays.fill(ans, -1);

     int left =0;
     int right = nums.length -1;

     //first occurance
     while(left <= right){
        int mid = left + (right -left)/2;
        if(nums[mid] == target){
            ans[0]= mid;
            right = mid-1;
        }
        else if( nums[mid] > target){
            right = mid-1;
        }
        else{
            left = mid+1;
        }
     }

     int l =0; int r =nums.length -1;
     while( l<=r){
        int mid = l + (r -l)/2;
        if(nums[mid] == target){
            ans[1]= mid;
            l = mid+1;
        }
        else if( nums[mid] > target){
            r = mid-1;
        }
        else{
            l = mid+1;
        }
     }
     return ans;
    }
}