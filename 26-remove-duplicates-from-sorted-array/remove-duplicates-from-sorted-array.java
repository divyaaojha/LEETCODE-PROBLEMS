class Solution {
    public int removeDuplicates(int[] nums) {
        // int n =nums.length;
        // int count=0;
        // for(int i=n-1; i>0; i-- ){
        //     if(nums[i] ==nums[i-1]){
        //         nums[i]= Integer.MAX_VALUE;
        //         count++;
        //     }

        // }
        // Arrays.sort(nums);
        // return n-count; // unique ele returned



        /*
        using 2 pointers, we will move the j pointer on every iteration, and the i pointer will only be on the unique items, 
        */
        int n = nums.length;
        int i =0; int j =0;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]= nums[j];
            }
        }
        return i+1;

    }
}