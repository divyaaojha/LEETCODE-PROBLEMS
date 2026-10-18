class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        
        int i =0; int j =nums.length -1;

        //binary search
        //all we are doing is trying to bring the lower boundary to the ele that is the smallest, i.e the starting ele which is less than ele at j(right)
        while(i<j){
            int mid = i + (j-i)/2 ;

            //if our middle ele more than last boundary
            if(nums[mid] > nums[j] ){
                i = mid+1;
            }
            else{
                //means- middle ele smaller than  rightmost ele at j, so move rightmost boundary at mid, as maybe the range we are looking for, its starting maybe mor eleftwards, so we moved right most boiundary more left
                j = mid;
            }
        }

        return nums[i];

    }
}