class Solution {
    public boolean check(int[] nums) {
int count=0;
for(int i =0; i<nums.length; i++){
        if( nums[i % nums.length] > nums[(i+1) % nums.length] ){
            count++;
            if (count >1){
                return false;
            }
        }
       }
       return true;


        //using formula, finding pivot, then *************************************
    //    int max = Integer.MAX_VALUE;
    //    int index=0;
    //    //FIND MIN ELE- ITS INDEX IS PIVOT, AND THEN USE IT IN THE FORMULA, PIVOT= X
    //    for(int i =0; i<nums.length; i++){
    //     if(nums[i] <max){
    //         max = nums[i];
    //         index =i;
    //     }
    //    }

    //    for(int i =1; i<nums.length; i++){
    //     if( nums[(i+index) % nums.length] < nums[(i-1+index) % nums.length] ){
    //         return false;
    //     }
    //    }
    //    return true;
    }
}