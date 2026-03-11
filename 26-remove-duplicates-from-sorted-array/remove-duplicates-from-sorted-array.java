class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int i =0; // pointer on last unique element  & j = scanning pointer
        for(int j =1; j<n ; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i]= nums[j];
            }
        }
        return i+1;

    //********************************************************************** */
        // int count = nums.length;
       
        // for(int i=0; i<nums.length -1; i++){
        //     if(nums[i]==nums[i+1]){
        //         nums[i]= Integer.MAX_VALUE;
        //         count--;
        //     }
        // }
        //  Arrays.sort(nums);
        //  return count;
/********************************************************* */
        //         int count=1;
        // for(int i =1; i<nums.length; i++){
        //     int j =i;
        //     while(j<nums.length && nums[i-1]==nums[j]){
        //         nums[j] = Integer.MAX_VALUE;
        //         j++;
        //     }
        //     if(nums[i]!= Integer.MAX_VALUE){
        //         count++;
        //     }
        // }
        // Arrays.sort(nums);
        // return count;



//ANOTHER SOLUTION
        // int count=1;
        // for(int i =1; i<nums.length; i++){
        //     int j =i;
        //     while(j<nums.length && nums[i-1]==nums[j]){
        //         nums[j] = Integer.MAX_VALUE;
        //         j++;
        //     }
        //     if(nums[i]!= Integer.MAX_VALUE){
        //         count++;
        //     }
        // }
        // Arrays.sort(nums);
        // return count;

    }
}