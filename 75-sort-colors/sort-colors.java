class Solution {
    void swap(int []arr, int l, int r){
        int temp = arr[l];
        arr[l]= arr[r];
        arr[r]= temp;
    }
    public void sortColors(int[] nums) {

        int left =0;
        int mid=0;
        int right = nums.length -1;

        while(mid <= right){
            if(nums[mid]==0){
                swap(nums, mid, left);
                mid++;
                left++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, right);
                    right--;
                
            }

        }














    //tried 75/89 test cases *************************************************
    //     //brute force
    //   int n = nums.length;
    //   int count=0;
    //   for(int i =0; i<n; i++){
    //     if(nums[i]==0){
    //         count++;
    //     }
    //   }
    //   int left =0; int right = n-1;
    //   int mid = count;
    //   while(left<mid && mid < right){
    //     if(nums[left]==0){
    //         left++;
    //     }
    //     if(nums[right]==2){
    //         right--;
    //     }
    //     if(nums[left]==1){
    //         int temp = nums[left];
    //         nums[left]= nums[mid];
    //         nums[mid]= temp;
    //         mid++;
    //     }
    //     if(nums[left]==2){
    //         int temp = nums[left];
    //         nums[left]= nums[right];
    //         nums[right]= temp;
    //         right--;
    //     }

    //      if(nums[mid]==0){
    //         int temp = nums[mid];
    //         nums[mid]= nums[left];
    //         nums[left]= temp;
    //         left++;
    //     }
        
    //   }

     
    }
}