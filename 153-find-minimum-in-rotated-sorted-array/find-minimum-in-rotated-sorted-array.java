class Solution {
    public int findMin(int[] nums) {

        // array is sorted, so to find we can use binary serach for sure
        //the other  fact is, figuring out with side, left or right has the min element, 
        //clearly said in O(logN)- this simply means sum will be solved by binary search only, a bit modified
        // we will use 2 pointers, 

        int left =0;
        int right= nums.length -1;

        while(left < right) {

            int mid = left + ( right - left ) / 2 ;

            //min is in right
            if(nums[mid] > nums[right]){
                left = mid+1;
                //even mid is greater than right index ele, thats why mid+1
            }

            else{
                right=mid;
            }

        }
        return nums[left];
    }
}