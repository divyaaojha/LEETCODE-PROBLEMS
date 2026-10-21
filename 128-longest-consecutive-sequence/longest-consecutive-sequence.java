class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxcount = 1;
        int count = 1;
        for(int i =0; i<nums.length-1; i++){


            if (nums[i + 1] == nums[i]) {
                // Skip duplicates
                continue;
            }

            if(nums[i+1] == nums[i]+1){
                count++;
                 maxcount = Math.max(maxcount, count);
            }
            else{
                count=1;
            }
           
        }
        return maxcount;
    }
}