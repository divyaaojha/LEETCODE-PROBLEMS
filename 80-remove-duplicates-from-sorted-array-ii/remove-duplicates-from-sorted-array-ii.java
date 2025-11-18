class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; int count = n;
        for(int i =1; i<n-1;i++ ){
            int a = nums[i];
            if(nums[i-1]==a && nums[i+1] ==a){
               nums[i-1]= Integer.MAX_VALUE;
               count--;
            }
           
        }

        Arrays.sort(nums);
        return count;
        
    }
}