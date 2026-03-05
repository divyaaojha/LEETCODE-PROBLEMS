class Solution {
    public int longestConsecutive(int[] nums) {
        
        //sorting and count - 0(nlogn) solution
        // it is asked to give solution in 0(n)
        if(nums.length ==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int count=0;
        int longest=1;
        for(int ele : set){
            int x = ele;
             count=1;

             //starting point of element, when it doesnt contain itself minus 1.
            if(! set.contains(x-1)){
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                longest= Math.max(longest, count);
            }
        }

        return longest;

    }
}