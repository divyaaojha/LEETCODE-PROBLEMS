class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
       
        for(int i=0; i<nums.length -1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]= Integer.MAX_VALUE;
                count--;
            }
        }
         Arrays.sort(nums);
         return count;
    }
}