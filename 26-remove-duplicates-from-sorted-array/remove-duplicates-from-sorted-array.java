class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        int count=0;
        for(int i=n-1; i>0; i-- ){
            if(nums[i] ==nums[i-1]){
                nums[i]= Integer.MAX_VALUE;
                count++;
            }

        }
        Arrays.sort(nums);
        return n-count;
    }
}