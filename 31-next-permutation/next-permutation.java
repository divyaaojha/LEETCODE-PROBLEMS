class Solution {
    public void nextPermutation(int[] nums) {
      //if from last we traverse, on right large ele than its left ele, then swap, and return, after comparing if that is greater, also for descending ele array we can make them  a separatebcase and handle, in 231, we compared , 3 left and 1right, right ele smaller so leave it, move leftwards, now compare 2left, and 3 right, the right is more so swap with its neighbour left, and return  

      int n = nums.length;
      int i =n-2;

      //loop to move i to the ele which is smaller than its right ele
      while(i>=0 && nums[i]>= nums[i+1]){
        i--;
      }

      //now finding the right ele mor ethan the ele at i, but smallest among all right
     if(i>=0){
        int j = n-1;
        while(nums[j] <= nums[i]){
            j--;
        }

        //found at j, now swap
        int temp= nums[j];
        nums[j]= nums[i];
        nums[i]= temp;
     }

     //reversing suffix
     int l = i+1;
     int r =n-1;
     while(l<r){
        int temp= nums[l];
        nums[l]= nums[r];
        nums[r]= temp;
        l++;
        r--;
     }

    }
}