class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // KEEP COUNTING CURRENT 1'S, AND RESET COUNT TO 0 WHEN 0 ENCOUNTERED
      int n = nums.length;
      int finalcount =0;
      int count=0;
      for(int i =0; i<n; i++){
        if(nums[i]==0) count=0;
        else {count++;
        finalcount= Math.max(finalcount, count);}
      }
     
      return finalcount;


      //TLE***********************************************************
        // int n = nums.length;
        // int finalcount =0;
        // int j =0;
        // while(j <n){
        //     int count=0;
        //     if(nums[j]==1)continue;
        //     while(nums[j]==0){
        //         count ++;
                 
        //     }
        //     finalcount = Math.max(finalcount, count);
        // }

        // return finalcount;
    }
}