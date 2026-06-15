class Solution {
    public int longestSubarray(int[] nums) {
        int left =0;
        int zeros=0;
        int maxlen=0;
        for(int right =0; right< nums.length; right++){
            if(nums[right]==0){
                zeros++;
            }
            while(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            maxlen= Math.max(maxlen, right-left);
        }
        return maxlen;
        /*
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
        */
    }
}