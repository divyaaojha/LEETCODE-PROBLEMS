class Solution {
    public boolean canJump(int[] nums) {

        //passed 157 / 175 testcases passed - SELF ATTEMPT

    //     boolean result = false;
    //     int n = nums.length - 1;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] == 0) {
    //             return false;
    //         }
    //         if (nums[i] >= (n - i)) {
    //             return true;
    //         }

    //         for (int j = i + 1; j < nums.length; j++) {

    //             if (nums[j] >= (n - j)) {
    //                 return true;
    //             }
    //             if (nums[j] == 0) {
    //                 return false;
    //             }
    //         }

    //     }
    //     return false;
    // 
    
    
    
    int n = nums.length;
    int maxReach =0;
    for(int i =0; i<n ; i++){
        if(i>maxReach)return false; // cant even reach ith index, let alone last index

        //update maxReach or extend reach
        //maxReach = maximum index we can reach so far
        maxReach= Math.max(maxReach , nums[i] + i);

        //early exit check - if can jump there
        if(maxReach >= n-1)return true;

    }

    return false;
    
    }
}