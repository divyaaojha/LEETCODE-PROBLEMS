class Solution {
    public int findPeakElement(int[] nums) {
        // peak ele- greater than its neighbour, so we basically have to see locally, checking its +1 and -1 index, and comparing, and returning the value
        // there are edge cases for 0th and last element,nums[-1] = nums[n] = -∞  -because of this condition id first ele is greater than 2nd it is peak ele, if last ele is grester than n-1 th ele, it is peak ele
        //we can return -index to any of the peaks.
       // so we ll still use binary search - because time complexity is asked to be - O(log n) time.
       // local slopes are the guiding factors

       int n = nums.length;
       if(n ==1)return 0;
       if (n==2){ if(nums[1] < nums[0]) return 0; else return 1;}

       if(nums[n-2] < nums[n-1])return n-1;
       if(nums[0] > nums[1]) return 0;

       int low = 1;
       int high = n-2;
       while(low <= high){
        int mid = low + (high -low)/2;
        if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
            return mid;
        }

        if(nums[mid+1] >nums[mid]){
            low = mid+1;
            
        }
        else{
            high = mid;
        }
       }

return -1;




























































    //    int n = nums.length;
    //    int max = nums[0];
    //    if(n==1)return 0;
    //    if(n ==2){
    //     if( nums[1] > nums[0]){
    //         return 1;      }
    //         else{
    //             return 0;
    //         }
    //    }
    //    if(nums[0] >nums[1])return 0;
    //    if(nums[n-1] > nums[n-2])return n-1;
    //    int low =1;
    //    int high =n-2;
    //    while(low<=high){
    //     int mid = low + (high -low)/2;
    //     if( nums[mid-1] <nums[mid] && nums[mid] > nums[mid+1] ){
    //         return mid;
    //     }

    //     //But peak finding depends only on LOCAL slope, not global comparison.
    //     //✔ This is the right idea:
    //     // Increasing slope → move right
    //     // Decreasing slope → move left
    //     if( nums[mid+1]> nums[mid]){
    //         low = mid+1;
    //     }
    //     //When you're on a descending slope, the peak could be at mid itself
    //     else{
    //         high = mid;
    //     }
    //    } 
    //    return -1;
    }
}