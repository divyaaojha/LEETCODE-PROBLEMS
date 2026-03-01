class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int evenidx=0;
        int oddidx=1;
        int[]ans = new int[n];

        for(int num: nums){
            if(num>=0){
                ans[evenidx]=num;
                evenidx+=2;
            }
            else{
                ans[oddidx]=num;
                oddidx+=2;
            }
        }
        return ans;

        // *********************WRONG LOGIC , AND  O(N^2) TC
        // boolean signflag=true;
        // //if flag == true, put positive element there, otherwise negative
        
        // for(int i=0;i<nums.length; i++){
        //     int k=0;
        //     if(signflag){// this position needs to have +ve ele
        //         if(nums[i]>=0){
        //             break;
        //         }
               
        //         //negative element encountered
        //         else if(nums[i]<0) {
        //             k=i+1;
        //             while(k<nums.length){
        //                 if(nums[k]>=0){
        //                     break;
        //                 }
        //                 k++;
        //             }
        //             int temp = nums[k];
        //             nums[k]=nums[i];
        //             nums[i]=temp;
        //         }

        //         signflag=false;
        //     }

            
        //     else{// this position needs to have -ve ele
                
        //      if(nums[i]<0){
        //             break;}

        //     else if(nums[i]>=0){
        //         k=i+1;
        //         while(k<nums.length){
        //                 if(nums[k]<0){
        //                     break;
        //                 }
        //                 k++;
        //             }
        //             int temp = nums[k];
        //             nums[k]=nums[i];
        //             nums[i]=temp;
        //     }
        //         signflag=true;
        //     }
        // }
        // return nums;
    }
}