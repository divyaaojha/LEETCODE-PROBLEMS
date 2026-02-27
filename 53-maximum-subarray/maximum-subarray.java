class Solution {
    public int maxSubArray(int[] nums) {

        // int maxsum=Integer.MIN_VALUE;
        //  int sum=0;
        // for(int i=0; i<nums.length; i++){
        //    sum += nums[i];
        //     maxsum= Math.max(maxsum, sum);
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // return maxsum;
        /********************DP WAY  */
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
        sum = Math.max(nums[i], sum + nums[i]);
        maxsum= Math.max(maxsum, sum);
           
        }
        return maxsum;

        //***************************************************** */
        //BRUTE-FORCE 201/220, DOESNT WORK FOR LARGE N
        // int maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length; i++){
        //     int sum =nums[i];
        //     for(int j=i+1; j<nums.length; j++){
        //         maxsum=Math.max(maxsum, sum);
        //         sum+=nums[j];
              
        //     }
        //     maxsum=Math.max(maxsum, sum);
        // }
        // return maxsum;
    }
}