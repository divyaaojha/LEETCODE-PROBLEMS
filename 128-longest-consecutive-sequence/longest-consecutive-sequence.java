class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int maxcount=0;
        for(int num:set ){
        
        // we check only if the num is the first one
        if(!set.contains(num-1)){

            int number = num;
            int count=1;
            while(set.contains(number+1)){
                count++;
                number++;
            }

            maxcount= Math.max(maxcount, count);
        }

        }
        return maxcount;

        /************************************ */
        // if (nums.length == 0) {
        //     return 0;
        // }

        // Arrays.sort(nums);

        // int maxcount = 1;
        // int count = 1;
        // for(int i =0; i<nums.length-1; i++){


        //     if (nums[i + 1] == nums[i]) {
        //         // Skip duplicates
        //         continue;
        //     }

        //     if(nums[i+1] == nums[i]+1){
        //         count++;
        //          maxcount = Math.max(maxcount, count);
        //     }
        //     else{
        //         count=1;
        //     }
           
        // }
        // return maxcount;
    }
}