class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int farthest =0;
        int currend=0; int count=0;

        //see n-1, because we can jump from n-2 to n-1 last, but we cant go anywhere from n-1(last step, so the second last step is the last valif index to be explored) 
        for(int i =0; i<n-1 ; i++){
            
            //everytime we get a better far value we update it 
            farthest =Math.max(farthest, nums[i] +i);


            //loop keeps going, and when current-end reaches the i index, then wehave to extend the current-end, so we update it
            //i.e we only jump when required(we reach limit), and current end always has best max jump values (as we update it with farthest)
            if(i == currend){
                count++;
                currend=farthest;
            }

            

        }

        return count;
    }
}