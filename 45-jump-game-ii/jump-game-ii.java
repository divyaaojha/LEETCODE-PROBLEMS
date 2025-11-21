class Solution {
    public int jump(int[] nums) {


        //FIRST TRY*******************************************************
        // 57 / 110 testcases passe**************************************************************
        // int n = nums.length; int maxReach = 0;
        // int count=0;

        // if(n==1 ){
        //     return 0;
        // }
        // for(int i =0; i<n; i++){
        //     int reach = nums[i]+i;
        //    if(reach > maxReach){
        //      maxReach = reach;
        //      count++;
        //    }
            
        //     if(maxReach>= n-1){
        //         return count;
        //     }
        // }
        // return count;

        int n = nums.length;
        int jump =0;
         if(n==1 ){
         return 0;}
        int farthest =0; int currend =0;
        for(int i =0; i<n-1; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currend){
                //we have to jump here
                jump++;
                //update currend now
                currend = farthest;
            }
            


        }
        return jump;
    }
}