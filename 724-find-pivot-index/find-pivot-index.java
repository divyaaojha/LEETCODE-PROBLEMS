class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum =0;
        int n = nums.length;

        int totalsum=0;
        for(int num: nums){
            totalsum+=num;
        }
        for(int i =0; i< n; i++ ){
             
            int rightsum=totalsum-leftsum- nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
           
        }


        return -1;


    // 
        // int n = nums.length;
        // int prefix[]= new int[n];
        // prefix[0]=0;
        // int suffix[]= new int[n];
        // suffix[n-1]=0;
        // int sum1=0;
        // int sum2=0;
        // //building prefi
        // for(int i =1; i<n; i++){
        //     sum1 +=nums[i-1];
        //     prefix[i]=sum1;
        // }
        // for(int i = n-2; i>=0; i--){
        //     sum2 += nums[i+1];
        //     suffix[i]= sum2;
        // }
        
        // for(int i =0; i< n; i++ ){
        //     if(prefix[i]==suffix[i]){
        //         return i;
        //     }
        // }
        // return -1;
    }
}