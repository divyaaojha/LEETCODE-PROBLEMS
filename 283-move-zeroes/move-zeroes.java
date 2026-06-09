class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i =0; int k =0;
        while(i <n){
            if(nums[i] !=  0){
                nums[k++]=nums[i++];
            }
            else{
                i++;
            }
        }
        while(k<n){
            nums[k++]=0;
        }
    }
}