class Solution {
    public int longestSubarray(int[] nums) {
        int maxlength =0;
        for(int i =0; i< nums.length; i++){
            int zero=0;
            for(int j =i; j< nums.length; j++){
                if(nums[j]==0)zero++;
                if(zero>1)break;
                maxlength= Math.max(maxlength, j-i);
             
            }
        }
        
        return maxlength;
    }
}
