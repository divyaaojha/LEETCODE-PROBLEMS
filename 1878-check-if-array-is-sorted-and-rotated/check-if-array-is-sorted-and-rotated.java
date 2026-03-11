class Solution {
    public boolean check(int[] nums) {
// count dips- only 1 dip in rotated sorted array where, nums[i]> nums[i+1] in sorted array
int x=0;
int n = nums.length;
int count =0;
for(int i =0; i<n; i++){
    if(nums[i %n]> nums[(i+1) %n]){
       count++;
       if(count>1){
        return false;
       }
       
    }
}


return true;








// int count=0;
// for(int i =0; i<nums.length; i++){
    //     if( nums[i % nums.length] > nums[(i+1) % nums.length] ){
    //         count++;
    //         if (count >1){
    //             return false;
    //         }
    //     }
    //    }
    //    return true;


      
    }
}